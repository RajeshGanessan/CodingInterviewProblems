package rahulQAPrograms;

import java.util.Random;
import java.util.Scanner;

public class prizeMoney {

    public static void main(String[] args) {

        System.out.println("Prize money");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomDigit = random.nextInt(9);
        System.out.println("Enter the number to guess");
        int num = sc.nextInt();
        sc.close();
        isPrizeWon(randomDigit,num);

    }

    private static void isPrizeWon(int random,int userInput){
        if(userInput > random){
            System.out.println("Guess is too high");
        } else if(userInput < random){
            System.out.println("Guess is too low");
        } else if(userInput ==  random){
            System.out.println("Right Guess, You win 10000USD$");
        }
    }
}
