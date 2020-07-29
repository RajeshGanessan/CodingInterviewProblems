package InterviewPrograms;

import java.util.Scanner;

public class swappingWithoutTemp {

    public static void main(String[] args) {

        System.out.println("Swapping without temp variable");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to swap");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After Swapping :: num1 "+num1);
        System.out.println("After Swapping :: num2 "+num2);

    }
}
