package InterviewPrograms;

import java.util.Scanner;

public class primeRange {

    public static void main(String[] args) {

        System.out.println("Prime range");

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        sc.close();

        while(start < end){

            boolean flag = false;

            for(int i=2;i<start/2;i++){

                if(start % i == 0){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.print(start + " ");
            }

            start++;
        }
    }
}
