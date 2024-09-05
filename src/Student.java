import java.util.Scanner;

public class Student {

    Scanner scanner = new Scanner(System.in);

    private String studentNames[] = new String[100];
    private String studentEmails[] = new String[100];
    private String studentCourses[] = new String[100];
    private int studentIDs[] = new int[100];
    private int studentAges[] = new int[100];

    private int studentCount = 0;

    public void menu() {

        while (true) {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("*******************************************");
            System.out.println("Enter (1) to launch menu or any other key to exit");
            String response = scanner.nextLine();

            if (response.equals("1")) {
                System.out.println("Please select one of the following menu items:");
                System.out.println("(1) Capture a new student.");
                System.out.println("(2) Search for a student.");
                System.out.println("(3) Delete a student.");
                System.out.println("(4) Print student report");
                System.out.println("(5) Exit Application.");

                int option = scanner.nextInt();
                scanner.nextLine(); 

                switch (option) {
                    case 1:
                        saveStudent();
                        break;
                    case 2:
                        searchStudent();
                        break;
                    case 3:
                        deleteStudent();
                        break;
                    case 4:
                        studentReport();
                        break;
                    case 5:
                        exitStudentApplication();
                        return;
                    default:
                        System.out.println("Invalid input");
                }

            } else {
                System.exit(0);
            }
        }
    }

    private void saveStudent() {
        System.out.println("Number of students you desire to add: ");
        int SIZE = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < SIZE; i++) {

            int studentID;
            while (true) {
                System.out.println("Enter the student id: ");
                //Checks if the user entered an integer value.
                if (scanner.hasNextInt()) {
                    studentID = scanner.nextInt();
                    scanner.nextLine(); 
                    break;
                } else {
                    System.out.println("Invalid input!!! Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                }
            }

            System.out.println("Enter the student name: ");
            String studentName = scanner.nextLine();

            int studentAge;
            while (true) {
                System.out.println("Enter the student age: ");
                //Checks if the user entered an integer value.
                if (scanner.hasNextInt()) {
                    studentAge = scanner.nextInt();
                    scanner.nextLine(); 

                    if (studentAge < 16) {
                        System.out.println("You have entered an incorrect student age. Please enter an age of 16 or above.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Invalid input!!! Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                }
            }

            System.out.println("Enter the student email: ");
            String studentEmail = scanner.nextLine();
            System.out.println("Enter the student course: ");
            String studentCourse = scanner.nextLine();
            //Saving students data into arrays
            studentIDs[studentCount] = studentID;
            studentNames[studentCount] = studentName;
            studentAges[studentCount] = studentAge;
            studentEmails[studentCount] = studentEmail;
            studentCourses[studentCount] = studentCourse;

            studentCount++;
            System.out.println("Student captured!");
            System.out.println("--------------------------------------------------");
        }
    }

    private void searchStudent() {
        System.out.println("Enter the student id to search: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        StringBuilder search = new StringBuilder();
        //Displaying student data searched by the user
        for (int x = 0; x < studentCount; x++) {
            if (studentIDs[x] == id) {
                search.append("STUDENT ID: ").append(studentIDs[x])
                        .append("\nSTUDENT NAME: ").append(studentNames[x])
                        .append("\nSTUDENT AGE: ").append(studentAges[x])
                        .append("\nSTUDENT EMAIL: ").append(studentEmails[x])
                        .append("\nSTUDENT COURSE: ").append(studentCourses[x])
                        .append("\n");
            }
        }
        //Checks if there is any student data saved
        if (search.length() == 0) {
            System.out.println("Student with Student Id: " + id + " was not found!");
        } else {
            System.out.println(search.toString());
        }
    }

    private void deleteStudent() {
        System.out.println("Enter the student id to delete: ");
        int delete = scanner.nextInt();
        scanner.nextLine(); 

        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            //Deletion of data searched by user
            if (studentIDs[i] == delete) {
                for (int x = i; x < studentCount - 1; x++) {
                    studentIDs[x] = studentIDs[x + 1];
                    studentNames[x] = studentNames[x + 1];
                    studentAges[x] = studentAges[x + 1];
                    studentEmails[x] = studentEmails[x + 1];
                    studentCourses[x] = studentCourses[x + 1];
                }
                studentCount--;
                //Indicates that the desired condition has been met.
                found = true;
                System.out.println("Student with Student Id: " + delete + " WAS deleted!");
                break;
            }
        }
        //Output when the studentID searched is not present
        if (!found) {
            System.out.println("Student with Student Id: " + delete + " not found!");
        }
    }

    private void studentReport() {
        StringBuilder report = new StringBuilder();
        //Displaying all student data stored
        for (int j = 0; j < studentCount; j++) {
            report.append("STUDENT ").append(j + 1)
                    .append("\n-------------------------------------------------")
                    .append("\nSTUDENT ID: ").append(studentIDs[j])
                    .append("\nSTUDENT NAME: ").append(studentNames[j])
                    .append("\nSTUDENT AGE: ").append(studentAges[j])
                    .append("\nSTUDENT EMAIL: ").append(studentEmails[j])
                    .append("\nSTUDENT COURSE: ").append(studentCourses[j])
                    .append("\n");
        }
        //Checks if there is any student data saved.
        if (report.length() > 0) {
            System.out.println(report.toString());
        } else {
            System.out.println("No students found.");
        }
    }

    private void exitStudentApplication() {
        System.out.println("Goodbye!!");
    }
}
