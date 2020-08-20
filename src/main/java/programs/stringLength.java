package programs;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringLength {

    public static void main(String[] args) throws IOException {

        System.out.println("getting String length without length method,Enter a string to find length");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int length = input.lastIndexOf("");
        System.out.println("length of " + input + " is " + length);
    }
}
