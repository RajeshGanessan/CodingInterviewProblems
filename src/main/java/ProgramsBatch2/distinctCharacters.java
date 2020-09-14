package ProgramsBatch2;

import java.util.Scanner;

public class distinctCharacters {

    public static void main(String[] args) {

        System.out.println("Finding the Distinct Characters in the String");
        System.out.println("Enter your input");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("The disntinct Characters are :");
        sc.close();
        getDistinctCharacters(input);
    }

    private static void getDistinctCharacters(String input){
        //rajeshganesh
        String isLowerCased = input.toLowerCase();

        while(isLowerCased.length() > 0 ){

            char c = isLowerCased.charAt(0);

            if(isLowerCased.lastIndexOf(c) == 0){
                System.out.print(c + " ");
            }

            isLowerCased = isLowerCased.replace(Character.toString(c),"");

        }
    }
}
