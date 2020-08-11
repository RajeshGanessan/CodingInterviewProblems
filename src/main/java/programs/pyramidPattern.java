package programs;


import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        System.out.println("Pyramid Pattern");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){


            for(int j=1;j<=i;j++){

                System.out.print(i);
            }
            System.out.println();
        }
    }
}
