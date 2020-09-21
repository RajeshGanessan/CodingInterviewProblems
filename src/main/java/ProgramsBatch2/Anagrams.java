package ProgramsBatch2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        System.out.println("AnaGrams");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings to find the Anagram");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        sc.close();
//      boolean isAnag =   isAnagram(str1,str2);
         boolean isAnag = isAnagramUsingSort(str1,str2);
      if(isAnag){
          System.out.println("The given Strings are anagrams");
      } else
          System.out.println("Not an Anagrams");
    }

    private static boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i=0;i<str1.length();i++){

            String c = Character.toString(str1.charAt(i));
            if(!(str2.contains(c))){
                return false;
            } else {

                str1 = str1.replace(c,"");
                str2 = str2.replace(c,"");

                if(str1.length()!=str2.length())
                    return false;

            }
        }
        return true;
    }

    private static boolean isAnagramUsingSort(String first,String second){

        if(first.length()!=second.length())
            return false;

        first =  first.toLowerCase();
        second = second.toLowerCase();

        char[] firstC = first.toCharArray();
        char[] secondC = second.toCharArray();

        Arrays.sort(firstC);
        Arrays.sort(secondC);

        if(Arrays.equals(firstC,secondC)){
            return true;
        }

        return false;
    }
}
