package Q2;

import java.util.Scanner;

public class Question1 {
    private String[] userAnswers;
    private String[] correctAnswers = {"B", "A", "B"};
    private int marks;
    Scanner userInput = new Scanner(System.in);

    public Question1() {
        super();
        userAnswers = new String[correctAnswers.length];
        marks = 0;
    }
    public void questions() {
        StringBuilder question1 = new StringBuilder();
        question1.append("What is the size of a right-angle (measured in degrees)?")
        .append("\nA. 95")
        .append("\nB. 90")
        .append("\nC. 120")
        .append("\nD. 92");
        System.out.println(question1);
        String question1Answer = userInput.nextLine();
        userAnswers[0] = question1Answer;//The answers entered by the user are stored within the array
        if (question1Answer.equalsIgnoreCase(correctAnswers[0])) {
            System.out.println("Correct!");
            marks++;//Increments marks for correct answers
        } else {
            System.out.println("Incorrect");
        }

        StringBuilder question2 = new StringBuilder();
        question2.append("Angles around a point amount to which sum?")
        .append("\nA. 360")
        .append("\nB. 300")
        .append("\nC. 270")
        .append("\nD. 290");
        System.out.println(question2);
        String question2Answer = userInput.nextLine();
        userAnswers[1] = question2Answer;//The answers entered by the user are stored within the array
        if (question2Answer.equalsIgnoreCase(correctAnswers[1])) {
            System.out.println("Correct!");
            marks++;//Increments marks for correct answers
        } else {
            System.out.println("Incorrect");
        }

        StringBuilder question3 = new StringBuilder();
        question3.append("True or False. Are opposite sides of a parallelogram adjacent")
        .append("\nA. True")
        .append("\nB. False");
        System.out.println(question3);
        String question3Answer = userInput.nextLine();
        userAnswers[2] = question3Answer;//The answers entered by the user are stored within the array
        if (question3Answer.equalsIgnoreCase(correctAnswers[2])) {
            System.out.println("Correct!");
            marks++;//Increments marks for correct answers
        } else {
            System.out.println("Incorrect");
        }
        //Mark allocation
        System.out.println("Your marks: " + marks + "/3");

        for (int i = 0; i < userAnswers.length; i++) {
            if (!userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Your answer " + userAnswers[i] + " question " + i + " was suppose to be " + correctAnswers[i]);
            }
        }
    }
}