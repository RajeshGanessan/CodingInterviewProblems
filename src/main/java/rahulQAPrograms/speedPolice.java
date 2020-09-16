package rahulQAPrograms;

import java.util.Scanner;

public class speedPolice {

    public static void main(String[] args) {
        System.out.println("Speed police");

        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt();
        boolean isBirthday = sc.nextBoolean();
        sc.close();

        System.out.println(getSpeedToken(speed,isBirthday));
    }

    private static String  getSpeedToken(int speed,boolean isBirthday) {

        if(isBirthday) speed-=5;
        if(speed <=60){
           return "0-No ticker";
        } else if(speed >=61 && speed <=80){
            return "1 -Small Ticket ";
        } else {
            return "3 - Big ticket";
        }
    }
}
