package programs;

import java.util.Scanner;

public class capitalize {

    public static void main(String[] args) {

        System.out.println("Captitalizing first word");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String capitalized = getCapitalized(input);
        System.out.println(capitalized);
    }

    private static String getCapitalized(String input) {

        String[] trimmed = input.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String text : trimmed) {
            Character firstChar = text.charAt(0);
            if(!Character.isUpperCase(firstChar)){
               sb = sb.append(Character.toUpperCase(firstChar)).append(text.substring(1)).append(" ");
        } else {
                sb = sb.append(text).append(" ");
            }
        }
        return sb.toString();
    }
}
