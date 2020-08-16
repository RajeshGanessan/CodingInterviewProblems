package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {

        System.out.println("getting the divisors for the Number");
        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();
        List<Integer> divisors = getDivisors(Number);
        System.out.println("The divisors of the " + Number + "are ");
//        divisors.forEach(System.out::println);
        printUsingSqrtMethod(Number);

    }

    private static List<Integer> getDivisors(int Number){

        List<Integer> divisors =  new ArrayList<>();
        for(int i=1 ;i<=Number/2;i++){

            if(Number%i==0){
            divisors.add(i);
            }
        }

        return divisors;
    }

    private static void printUsingSqrtMethod(int n){

        int maxD = (int) Math.sqrt(n);

        for(int i=1;i<=maxD;i++){

            if(n%i==0){

                if(n/i==i){
                    System.out.print(n);
                } else {
                    System.out.print(i +" ");
                    System.out.print(n/i+ " ");
                }
            }
        }
    }
}
