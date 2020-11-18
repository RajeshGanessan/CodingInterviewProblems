package rahulQAPrograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class exercise27 {

    public static void main(String[] args) {

        System.out.println("Check whether it is 1 or 4");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

//        boolean result = checkArray(a);
//        System.out.println(result);
        usingStreams(a);
    }

    private static boolean checkArray(int[] a){
        boolean flag = true;
        for(int i=0;i<a.length;i++){
            if(a[i]!=1 && a[i]!=4){
                flag = false;
            }
        }
        return flag;
    }

    //using streams
    private static void usingStreams(int[] a){

        if(Arrays.asList(a).contains(null)){
            System.out.println("Given array should not contain null element");
        } else {
            System.out.println(Arrays.stream(a).allMatch(num -> num==1 || num==4));
        }
    }
}
