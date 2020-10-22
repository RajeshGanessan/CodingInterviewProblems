package rahulQAPrograms;

import java.util.Scanner;

public class e15String {

    public static void main(String[] args) {

        System.out.println("Exercise 15 - String repeat");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        sc.close();
        if(input.length() <=2){
            System.out.println(input + input + input);
        } else {
            String chars = input.substring(0,2);
            sb.append(chars).append(chars).append(chars);
            System.out.println(sb.toString());
        }
    }

}
