package programs;

import java.util.Scanner;

public class WhiteSpaceBetween {

    public static void main(String[] args) {
        System.out.println("Trimming whitespace between the words");

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        System.out.println("Original String : " + inputText);
        String trimmed = getTrimmedUsingRegex(inputText);
        System.out.println(trimmed);
        trimmed = getTrimmed(inputText);
        System.out.println("Without regex  :" + trimmed);
        trimmed = removeExtraWhite(inputText);
        System.out.println("Removed extra spaces : " + trimmed);

    }

    private static String getTrimmedUsingRegex(String input){

        return input.replaceAll(" ","");
    }

    private static String getTrimmed(String input){

        int length = input.length();
        String trimmed = "";
        for(int i=0;i<length;i++){

            if(input.charAt(i) == ' '){
               trimmed =  input.replace(" ","");
            }
        }
        return trimmed;
    }

    private static String removeExtraWhite(String input){

        String withoutExtraSpaces = "";
        System.out.println(withoutExtraSpaces.length());
        char[] charArray = input.toCharArray();

        for(int i=0;i<input.length()-1;i++){

            if(charArray[i] == ' '){

                if(!(withoutExtraSpaces.length()==0)){
                    if(charArray[i+1]!= ' '){
                        withoutExtraSpaces = withoutExtraSpaces + charArray[i];
                    }
                }
            } else {
                withoutExtraSpaces = withoutExtraSpaces + charArray[i];
            }
        }

        return withoutExtraSpaces;
    }
}
