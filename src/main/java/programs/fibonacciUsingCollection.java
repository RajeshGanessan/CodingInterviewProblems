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
        }

        System.out.println("Fibonacci Series for provided Input "+ fiboSeries.toString());
    }
}
