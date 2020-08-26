package programs;

import java.util.Scanner;

public class TrimString {

    public static void main(String[] args) {
        System.out.println("Trimming String without using Trim method");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Original String : " + input );
        String trimmed = getTrimmedString(input);
        System.out.println("Trimmed String : " + trimmed);
    }

    private static String getTrimmedString(String input){

        int startIndex = 0;
        int endIndex = input.length()-1;
        char[] charArray = input.toCharArray();

        while(startIndex<=input.length() && charArray[startIndex] == ' '){
            startIndex++;
        }

        while(startIndex<endIndex && charArray[endIndex] == ' '){
            endIndex--;
        }

        return input.substring(startIndex,endIndex+1);
    }
}
