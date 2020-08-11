package programs;

import java.util.Scanner;

public class positionOfCharacter {

    public static void main(String[] args) {
        System.out.println("Position of character");

        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        System.out.println("Position of  '" + letter + "' is " + getPosition(letter));
    }

    private static int getPosition(char character){

        char Letter = Character.toLowerCase(character);
        return Letter - 96;
    }
}
