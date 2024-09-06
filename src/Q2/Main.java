package Q2;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] correctAnswersForQ1 = {"B", "A", "B"};

        Question1 q1 = new Question1(correctAnswersForQ1);
        q1.questions();
        Question2 q2 = new Question2();
        q2.questions();
    }
}
