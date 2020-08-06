package InterviewPrograms;

import java.util.Scanner;

public class frequencyOfChar {

    public static void main(String[] args) {

        System.out.println("frequency of character");
        frequencyOfChar freq =  new frequencyOfChar();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Character charToFind = 'r';
        System.out.println(freq.getFrequencyOfChar(input,charToFind));
        }

        private int getFrequencyOfChar(String input,Character ch){

        int frequency = 0;
       String trimmed =  input.trim();
        for(int i=0;i<trimmed.length();i++){
            Character character = input.charAt(i);
            if(ch.equals(character)){
                frequency++;
            }
        }

        return frequency;
        }
}
