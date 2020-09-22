package ProgramsBatch2;

import java.util.Scanner;

public class CharacterCase {

       static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Changing character for each Character");

        String text = sc.nextLine();

        String result = getUpdatedCase(text);
        System.out.println("Updated Characters are :: " +result );

    }

    private static String getUpdatedCase(String text) {

        char[] textChar = text.toCharArray();

        for(int i=0;i<textChar.length;i++){

            if(Character.isUpperCase(textChar[i])){
                textChar[i] = Character.toLowerCase(textChar[i]);
            } else if(Character.isLowerCase(textChar[i])){
                textChar[i] = Character.toUpperCase(textChar[i]);
            }
        }
        return new String(textChar);
    }
}
