package Q2;

import java.util.Scanner;

public class Question2 extends Question1 {
    private String[] userAnswers;
    private String[] correctAnswers = {"C", "D", "C"};
    private int marks;

    public Question2() {
        userAnswers = new String[correctAnswers.length];
        marks = 0;
    }
    Scanner userInput = new Scanner(System.in);
    @Override
    public void questions() {
        StringBuilder question1a = new StringBuilder();
        question1a.append("Solve for x: 2x + 30 = 24")
        .append("\nA. 3")
        .append("\nB. 6")
        .append("\nC. -3")
        .append("\nD. -6");
        System.out.println(question1a);
        String question1aAnswer = userInput.nextLine();
        //The answers entered by the user are stored within the array
        userAnswers[0] = question1aAnswer;

        if (question1aAnswer.equalsIgnoreCase(correctAnswers[0])) {
            System.out.println("Correct!");
            marks++;
        } else {
            System.out.println("Incorrect");
        }

        StringBuilder question1b = new StringBuilder();
        question1b.append("Solve simultaneously: x + 2 = y and 2x + 30y = 24")
        .append("\nA. x = 1.215, y = 0.758")
        .append("\nB. x = -1.214, y = -0.876")
        .append("\nC. x = 1.121, y = 1.453")
        .append("\nD. x = -1.125, y = 0.875");
        System.out.println(question1b);
        String question1bAnswer = userInput.nextLine();
        //The answers entered by the user are stored within the array
        userAnswers[1] = question1bAnswer;
        
        if (question1bAnswer.equalsIgnoreCase(correctAnswers[1])) {
            System.out.println("Correct!");
            marks++;
        } else {
            System.out.println("Incorrect");
        }

        StringBuilder question1c = new StringBuilder();
        question1c.append("Solve for x: 3(2x - 3) - 7 = 9 - 3(4x - 5)")
        .append("\nA. 3.22")
        .append("\nB. 9/20")
        .append("\nC. 2.22")
        .append("\nD. 2.23");
        System.out.println(question1c);
        String question1cAnswer = userInput.nextLine();
        //The answers entered by the user are stored within the array
        userAnswers[2] = question1cAnswer;
        
        if (question1cAnswer.equalsIgnoreCase(correctAnswers[2])) {
            System.out.println("Correct!");
            marks++;
        } else {
            System.out.println("Incorrect");
        }
        //Mark allocation
        System.out.println("Your marks: " + marks + "/3");

        for (int i = 0; i < userAnswers.length; i++) {
            if (!userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Your answer " + userAnswers[i] + " was suppose to be " + correctAnswers[i]);
                break;
            }
        }
    }
}
