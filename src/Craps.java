import java.util.Random;
import java.util.Scanner;
    public class Craps {
        public static void main(String[] args) {
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);
            String playAgain = "Y";
            while (playAgain.equalsIgnoreCase("Y")) {
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int sum = die1 + die2;
                System.out.println("Die 1: " + die1);
                System.out.println("Die 2: " + die2);
                System.out.println("Sum: " + sum);
                if (sum == 2 || sum == 3 || sum == 12) {
                    System.out.println("Craps! You lose!");
                } else if (sum == 7 || sum == 11) {
                    System.out.println("Natural! You win!");
                } else {
                    int point = sum;
                    System.out.println("The point is: " + point);
                    while (sum != 7 && sum != point) {
                        die1 = rnd.nextInt(6) + 1;
                        die2 = rnd.nextInt(6) + 1;
                        sum = die1 + die2;
                        System.out.println("Die 1: " + die1);
                        System.out.println("Die 2: " + die2);
                        System.out.println("Sum: " + sum);
                        if (sum == point) {
                            System.out.println("Made point! You win!");
                        } else if (sum == 7) {
                            System.out.println("Got a seven! You lose!");
                        } else {
                            System.out.println("Trying for point: " + point);
                        }
                    }
                }
                System.out.print("Play again? (Y/N): ");
                playAgain = in.nextLine();
                System.out.println();
            }
            System.out.println("Thanks for playing!");
            in.close();
        }
    }
