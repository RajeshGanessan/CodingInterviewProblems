package ProgramsBatch2;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CommonChars {

    public static void main(String[] args) {

        System.out.println("Finding common Chars in 2 string");

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // getCommonCharacters(s1,s2);

        System.out.println(getCommonChars(s1, s2));


    }

    private static void getCommonCharacters(String s1, String s2) {

        String cased1 = s1.toLowerCase();
        String cased2 = s2.toLowerCase();

        for (int i = 0; i < cased1.length(); i++) {
            char c = cased1.charAt(i);
            for (int j = 0; j < cased1.length(); j++) {
                char ch = cased2.charAt(j);
                if (Character.toString(c).equals(Character.toString(ch))) {
                    System.out.print(ch + " ");
                }
            }
        }
    }

    private static String getCommonChars(String s1, String s2) {
        StringBuilder commonchars = new StringBuilder();

        if (s1.length() > 0 && s2.length() > 0) {

            String toBeIterated = (s1.length() > s2.length()) ? s2 : s1;
            String toBeChecked = (s1.contains(s2)) ? s1 : s2;
            System.out.println("to be iterated " + toBeIterated);
            System.out.println("To be checked " + toBeChecked);

            for (int i = 0; i < toBeIterated.length(); i++) {

                if (toBeChecked.contains(Character.toString(toBeIterated.charAt(i)))) {
                    commonchars.append(toBeChecked.charAt(i));
                }
            }
            return commonchars.toString();

        } else {
            return "";
        }
    }

    private static String getCommonWithCollection(String s1, String s2) {

        if (s1.length() > 0 && s2.length() > 0) {
            List<String> string1 = List.of(s1);
            List<String> string2 = List.of(s2);

            string1.retainAll(string2);

            return string1.toString();

        } else
            return "";
    }
}
