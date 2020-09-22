package rahulQAPrograms;

import java.util.Scanner;

public class exer13B {

    /*Given a string, count the number of words ending in 'y' or 'z' --
i.e.
string "heavy" → Output 1 : As it has 1 y at end, so output should be 1.
string "Yellow"→ Output 0 : As it has 1 y but its not at the end, its at the beginning, so output should be 0.
*/
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a String to find the count");

        String input = sc.nextLine();
        System.out.println(getCount(input));


    }
        private static int getCount(String input){
            String[] split = input.split(" ");
            int count = 0;
            for (int i = 0; i < split.length; i++) {
                String xyz = split[i];
                char c = xyz.charAt(xyz.length()-1);
                    if (c == 'y' || c == 'z') {
                        count++;
                    }
            }
            return count;
        }

}
