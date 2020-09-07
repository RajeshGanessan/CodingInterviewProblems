package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class socks {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int countPair = 0;
        if(n<=0){
            return countPair;
        }

        Set<Integer> socksPair = new HashSet<>();
        for(int socks : ar){
            if(!socksPair.contains(socks)){
                socksPair.add(socks);
            } else {
                countPair++;
                socksPair.remove(socks);
            }
        }

        return countPair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the socks count");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println("Pair of socks can be sold are " + result);

        scanner.close();
    }
}
