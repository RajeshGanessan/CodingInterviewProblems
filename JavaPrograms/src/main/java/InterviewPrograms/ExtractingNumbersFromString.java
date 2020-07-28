package InterviewPrograms;

import java.util.Scanner;

public class ExtractingNumbersFromString {


    public static void main(String[] args) {

        System.out.println("Extracting Numbers from the String");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        boolean isAlphanumeric = userInput.matches("[A-Za-z0-9]+");
        StringBuilder extractedDigits = new StringBuilder();
        int sum= 0;
        if(isAlphanumeric){
            for(int i = 0; i<userInput.length();i++){
                char ch = userInput.charAt(i);
                if(Character.isDigit(ch)){
                    extractedDigits.append(ch);
                    sum = sum + Character.getNumericValue(ch);
                }
            }
        }

        System.out.println("Digits extracted from the String " + extractedDigits.toString());
        System.out.println("Sum of the digits Extracted " + sum);
    }
}
