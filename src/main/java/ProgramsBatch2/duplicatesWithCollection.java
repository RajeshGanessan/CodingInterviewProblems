package ProgramsBatch2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicatesWithCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find the duplicates ");
        String inputText = sc.nextLine();

        sc.close();
        System.out.println(getWithoutDuplicates(inputText));

    }

    private static String getWithoutDuplicates(String inputText) {

        char[] inputArray = inputText.toCharArray();

        LinkedHashSet<Character> withoutDuplicates = new LinkedHashSet<>();
        for(Character ch : inputArray){
            withoutDuplicates.add(ch);
        }

        StringBuilder finalStr = new StringBuilder();
       withoutDuplicates.stream().forEach(ch -> finalStr.append(ch));
       return finalStr.toString();
    }
}
