package InterviewPrograms;

import java.util.Scanner;

public class Reversse {

    public static void main(String[] args) {
        System.out.println("Reversing a numbers");

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the number to Reverse");
//        int Number = sc.nextInt();
//
//        System.out.println("Reversed Number is " + ReverseNumber(Number));

        System.out.println("Enter the string to Reverse!");

        String text = sc.next();

        System.out.println(ReverseText(text));


    }

    //Reversing a Number
    private static int ReverseNumber(int Number){

        int reverse = 0;

        while(Number!=0){

            int n = Number%10;
            reverse = reverse *10 + n;
            Number = Number/10;
        }

        return reverse;
    }

    //reversing A string
    private static String ReverseText(String text){

        String Reversed = " ";
        int length = text.length();

        for(int i=length-1;i >=0 ;i--){

            char ch = text.charAt(i);

            Reversed = Reversed + ch;
        }

        return Reversed;
    }
}
