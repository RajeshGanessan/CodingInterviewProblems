package programs;

import java.util.Scanner;

public class EquilateralTriangle {

    public static void main(String[] args) {
        System.out.print("Pyramid/Equilateral Pattern Program");
        System.out.println("Enter the number of rows for triangle");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        drawTriangle(rows);
    }

    private static void drawTriangle(int rows) {
        int i,j;
        int spaceRow = rows-1;
        for(i=1;i<=rows;i++){

            for(j=i;j<=spaceRow;j++) System.out.print(" ");

            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
