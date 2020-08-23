package programs;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOfword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        String[] splitted = splitWords(inputText);
        ChangePosition(splitted);

    }

    private static String[] splitWords(String input){
        return input.split(" ");
    }

    private static void ChangePosition(String[] words){
        StringBuilder changed = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            changed.append(words[i]).append(" ");
        }
        System.out.print(changed);
    }
}
