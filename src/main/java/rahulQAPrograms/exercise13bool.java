package rahulQAPrograms;

import java.util.Scanner;

public class exercise13bool {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("checking boolean condition");

        String text = sc.nextLine();
        boolean flag = sc.nextBoolean();

        System.out.println(getResult(text,flag));

    }

    private static String getResult(String text, boolean flag) {
        //Can also use CharacterAt to return the character
        if (text.length() <=1) {
            System.out.println("Invalid stiring,Please enter different string");
            return "";
        } else {
            if (flag)
                text = text.substring(0, 1);
            else
                text = text.substring(text.length()-1);
        }
        return text;
    }
}


