package rahulQAPrograms;

import java.util.Scanner;

public class Exercise15b {

    public static void main(String[] args) {

        System.out.println("String concat");

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String result = a.concat(b).concat(b).concat(a);
        System.out.println(result);
    }
}
