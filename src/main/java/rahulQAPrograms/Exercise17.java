package rahulQAPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        System.out.println("No of occurances");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        countOfCode(input);

    }

    private static void countOfCode(String input){

        System.out.println((input.split("code", -1).length-1));
    }
}
