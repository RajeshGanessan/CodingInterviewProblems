package rahulQAPrograms;

import java.util.Scanner;

public class Exercise16b {

    public static void main(String[] args) {

        System.out.println("bad occurance");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(getStatus(input));

    }
        private static boolean getStatus(String input){
            boolean flag = false;
            if (input.indexOf("bad") == 0 || input.indexOf("bad") == 1) {
                flag = true;
            }

            return flag;
        }
}
