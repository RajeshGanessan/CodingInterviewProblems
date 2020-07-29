package InterviewPrograms;

import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {

        System.out.println("Floyds Triangle");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the triangle");
        int rows = sc.nextInt();
        int k=1;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){

                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
