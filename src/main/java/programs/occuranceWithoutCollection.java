package programs;

import java.util.Scanner;

public class occuranceWithoutCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        getOccurances(inputText);
    }

    private static void getOccurances(String inputText) {

        String inputString = inputText.toUpperCase();

        while(inputString.length()>1){

            int counter = 0;
            Character ch = inputString.charAt(0);

            for(int j=0;j<inputString.length();j++){
                if(ch.equals(inputString.charAt(j))){
                    counter++;
                }
            }

            if(Character.isWhitespace(ch)){
                System.out.println("Whitespace count : " + counter);
            }else {
                System.out.println("Occurance of " + inputString.charAt(0) + " : " + counter);
            }

            inputString = inputString.replace(Character.toString(inputString.charAt(0)),"");

            if(inputString.length()==1){
                System.out.println("Occurance of : " + inputString.charAt(0) + " = 1");
            }
        }
    }
}
