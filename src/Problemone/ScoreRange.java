package Problemone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score (0 - 100): ");
            try {
                int input = sc.nextInt();
                if (input < 0 || input > 100) {
                    throw new UnsupportedOperationException("Input number should be (0 - 100).");
                } else {
                    System.out.println("Your score is: " + input);
                }
            } catch (InputMismatchException e) {
                    System.out.println("Please input number only !");
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            } finally {
                sc.close();
            }
    }
}

