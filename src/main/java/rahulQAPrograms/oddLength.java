package rahulQAPrograms;

import java.util.Scanner;

public class oddLength {

    public static void main(String[] args) {

        System.out.println("return odd length string");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        sc.close();

        if(input.length()<3){
            System.out.println("enter valid String to return");
        }else if(input.length()%2==0){
            System.out.println("The String length should be odd");
        } else {

            int l = input.length()-3;
            int g = l/2;
            for(int i=g; i< input.length()-g;i++){
                System.out.print(input.charAt(i));
            }
        }
    }
}
