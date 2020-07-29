package InterviewPrograms;

import java.util.Scanner;

public class palindromeWithoutReverse {

    public static void main(String[] args) {


        System.out.println("Palindrome without reverse method");

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string to check whether it is palindrome or not");

        String text = sc.next();
        sc.close();

        String reverse = "";

        char[] inputArr = text.toCharArray();
        for(int i=inputArr.length-1;i>=0;i--){
            reverse = reverse + inputArr[i];
        }
        System.out.println("Input by user  = " + text);
        System.out.println("Input after reversed  = " + reverse);

        if(text.equals(reverse)){
            System.out.println("Given string is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

        palindromeUsingBuffer(text);
    }


    private static void palindromeUsingBuffer(String textToVerify){

        StringBuilder reversedString = new StringBuilder(textToVerify);
        reversedString.reverse();
        if(textToVerify.equals(reversedString.toString()))
            System.out.println("String is palindrome using builder");
        else
            System.out.println("not a palindrome using builder");
    }
}
