package ProgramsBatch2;

import java.util.Scanner;

public class duplicatesWithoutCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find the duplicates ");
        String inputText = sc.nextLine();
        String finalString = removeDuplicates(inputText);
        System.out.println(finalString);

        sc.close();
    }

    private static String removeDuplicates(String input){

        StringBuilder builder = new StringBuilder();
        char[] chars = input.toCharArray();

            for (Character ch : chars){
                if(!builder.toString().contains(Character.toString(ch))){
                    builder = builder.append(ch);
                }
        }

        return builder.toString();

    }
}
