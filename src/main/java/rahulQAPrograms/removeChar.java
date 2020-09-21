package rahulQAPrograms;

import java.util.Scanner;

public class removeChar {

    public static void main(String[] args) {
        System.out.println("Removing Character");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = sc.nextInt();

        removeCharacter(input, index);
    }

    private static void removeCharacter(String input, int index) {

        if (index < 0 || index > input.length()) {
            System.out.println("Invalid Index, Enter correct Index for removing");
        } else {
            char[] ch = new char[input.length() - 1];
            for (int i = 0; i < input.length() - 1; i++) {
                if (i < index) {
                    ch[i] = input.charAt(i);
                } else {
                    ch[i] = input.charAt(i + 1);
                }
            }
            String result =  new String(ch);
            System.out.println(result);
        }
    }
}

