package rahulQAPrograms;

import java.util.Scanner;

public class exercise19 {


    //"Given a string, compute a new string by moving the first char to come after the next two chars.
    //Repeat this process for each subsequent group of 3 chars.Ignore any group of fewer than 3 chars at the end.
    //Ex1: (""abc"") → ""bca""
    //Ex2: (""tca"") → ""cat""
    //Ex3: (""tcagdo"") → ""catdog""
    //Ex3: (""abcdef"") → ""bcaefd"""
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        int len = input.length();
        if(len <=2){
            System.out.println("Pls enter String length more than 2");
        } else if(len == 3){

            char firstChar  = input.charAt(0);
            input = input.substring(1,len);
            String newString = input+firstChar;
            System.out.println(newString);
        } else {

            String result = "";
            for(int i=0;i<len-2;i+=3){
                result = result + input.substring(i+1,i+3) + input.charAt(i);
            }
            System.out.println(result);
        }
    }
}
