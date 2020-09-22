package rahulQAPrograms;

import java.util.Scanner;

public class concatString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String first = sc.nextLine();
        String second = sc.nextLine();

        first = first.substring(1);
        second = second.substring(1);

        System.out.println(sb.append(first).append(second).toString());
    }
}
