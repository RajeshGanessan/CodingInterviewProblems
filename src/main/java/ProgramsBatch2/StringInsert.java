package ProgramsBatch2;

import java.util.Scanner;

public class StringInsert {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Inserting String");


        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int indexToInsert = sc.nextInt();

        sc.close();
        String result = getUsingStringBuilder(s1,s2,indexToInsert);
        System.out.println(result);

        System.out.println("Using subString method" + InsertUsingSubString(s1,s2,indexToInsert));
    }

    private static String getUsingStringBuilder(String s1, String s2, int index) {

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        sb1.insert(index,sb2);
        return sb1.toString();
    }

    private static String InsertUsingSubString(String s1,String s2,int index){

        s1 = s1.substring(0,index)+s2+s1.substring(index);
        return s1;
    }


}
