package programs;

import java.util.*;

public class sortStrings {

    public static void main(String[] args) {

        System.out.println("Sorting words in a sentence");

        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
//        SortString(input);
        UsingSortMethod(input);
    }

    private static void SortString(String input){

        String[] words = input.split(" ");
        String temp;
        for(int i=0;i<words.length;i++){

            for(int j=i+1;j<words.length;j++){

                int word = words[i].compareTo(words[j]);
                if(word > 0){
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("The alphabetical order is " + Arrays.toString(words));
    }

    private static void UsingSortMethod(String input){

        List<String> words =  new ArrayList<>();

        words.addAll(Arrays.asList(input.split(" ")));

        Collections.sort(words);
        words.forEach(System.out::println);
        }
}
