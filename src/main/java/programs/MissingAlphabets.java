package programs;

import java.util.*;

public class MissingAlphabets {

    public static void main(String[] args) {
        System.out.println("Finding missing alphabets");

        String alphabets[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        sc.close();
        inputText  = inputText.replaceAll(" ","");

        String[] inputString = inputText.split("");

        HashSet<String> s1 = new HashSet<>(Arrays.asList(alphabets));
        HashSet<String> s2 = new HashSet<>(Arrays.asList(inputString));

        s1.removeAll(s2);

        System.out.println(s1);


    }
}
