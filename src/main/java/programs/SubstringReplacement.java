package programs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SubstringReplacement {

    public static void main(String[] args) {
        System.out.println("Replacing a word in string");

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Select the word to be replaced");
        String wordToBeReplaced = sc.next();
        System.out.println("Enter the word to be replaced with");
        String wordToBeReplacedWith = sc.next();

        String[] splitted = text.split(wordToBeReplaced);
        Stream.of(splitted).forEach(System.out::println);
        StringBuffer buffer = new StringBuffer();
//
        for(int i = 0;i<=splitted.length-1;i++){
            buffer = buffer.append(splitted[i]);

            if(i != splitted.length-1){
                buffer = buffer.append(wordToBeReplacedWith);
            }
        }

        System.out.println(buffer);
    }
}
