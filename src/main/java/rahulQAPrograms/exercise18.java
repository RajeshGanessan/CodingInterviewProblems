package rahulQAPrograms;

import java.util.Scanner;

public class exercise18 {


    public static void main(String[] args) {

        System.out.println("Exercise 18");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String a = "cat";
        String b = "dog";

        //CATdogwerwqer
//                    13-10
        int aa =(input.length()-input.replace(a,"").length())/a.length();
        int bb = (input.length()-input.replace(b,"").length())/a.length();

        if(aa==bb){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
