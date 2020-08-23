package programs;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {

        System.out.println("Reversing Every word in a String");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        String[] splitted = splitWords(inputText);

        for (String s : splitted) {
            getReversed(s);
        }

    }

    private static String[] splitWords(String input){
        return input.split(" ");
    }

    private static void getReversed(String words){
        String reverse = "";
        for(int i=words.length()-1;i>=0;i--){
            reverse = reverse + words.charAt(i);
        }
        System.out.print(reverse + " ");
    }
}
