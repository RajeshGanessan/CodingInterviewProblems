package programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class positionOfSpecial {

    public static void main(String[] args) {

        System.out.println("Position of special Enter!, Enter a String here");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Pattern p = Pattern.compile("[!\\\"#$%&'()*+,-./:;<=>?@\\\\[\\\\]^_`{|}~]");
        Matcher match = p.matcher(input);

        int countOfSplChars = 0;
        while(match.find()){
            countOfSplChars+=1;
            System.out.println(input.charAt(match.start()) + " at position " + (match.start()+1));
        }

        System.out.println("Total special characters " + countOfSplChars);
    }
}
