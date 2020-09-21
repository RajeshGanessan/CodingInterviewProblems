package rahulQAPrograms;

import java.util.Scanner;

public class StringCheck {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("String manipulation");

        String a = "[[]]";
        String b = sc.nextLine();

        String result = a.substring(0,a.length()/2)+b+a.substring(2,4);
        System.out.println(result);
    }

}
