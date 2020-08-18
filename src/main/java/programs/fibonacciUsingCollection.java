package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacciUsingCollection {

    public static void main(String[] args) {
        System.out.println("Fibonacci Series Using Collections");

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        sc.close();
        List<Integer> fiboSeries = new ArrayList<>();
        fiboSeries.add(0);
        fiboSeries.add(1);

        if(length==0){
            System.out.println("This is an Invalid input");
        } else if (length == 1)
            System.out.println(fiboSeries.get(0));
         else if(length==2)
        System.out.println(fiboSeries);
         else {
             for(int i=3;i<=length;i++){
                 fiboSeries.add(fiboSeries.get(i-2) + fiboSeries.get(i-3));
             }
            System.out.println("Fibonacci Series for provided Input "+ fiboSeries.toString());
        }


        System.out.println("Fibonacci Using Tail Recursions");
        for(int i =1;i<=length;i++){
            System.out.print(fiboUsingTailRecursion(i - 1) + " , ");
        }
    }

    private static int fiboUsingTailRecursion(int number){
        if(number == 0) {
            return 0;
        }

        if(number == 1) {
            return 1;
        }
         return fiboUsingTailRecursion(number-1) + fiboUsingTailRecursion(number-2);
    }

}
