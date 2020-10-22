package rahulQAPrograms;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        System.out.println("Exercise 16 - Displaying n Chars");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

       String result =  input.substring(0,n).concat(input.substring(input.length()-n));
        System.out.println(result);
    }
}
