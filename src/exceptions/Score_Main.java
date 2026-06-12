package exceptions;

import java.util.Scanner;

public class Score_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = Integer.parseInt(scanner.nextLine());

        try{
            boolean passed = hasPassed(score);
            if(passed) {
                System.out.println("You score is " + score + ". Yahooo, passed!");
            } else {
                System.out.println("You score is " + score + ", you failed...");
            }
        } catch(InvalidScoreException e) {
            System.out.println(e.getMessage());
            System.out.println("Your invalid score is: " + e.getScore() + ", try entering again");
        }
        scanner.close();
    }

    public static boolean hasPassed(int score) throws InvalidScoreException {
        if(score < 0 || score > 100) {
            throw new InvalidScoreException("Provide a valid score", score);
        }
        return score >= 50;
    }
}
