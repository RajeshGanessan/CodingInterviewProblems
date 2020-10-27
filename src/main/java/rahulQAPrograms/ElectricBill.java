package rahulQAPrograms;

import java.util.Scanner;

public class  ElectricBill {


    public static void main(String[] args) {

        System.out.println("Electric bill consumption");

        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();

        System.out.println("Amount is = "+ getAmount(units));
    }

    private static int getAmount(int units) {

        int amount = 0;
        if(units <=100){
            amount = units *10;
        }
        else if( units > 100 && units <=200){
            int x = units - 100;
            amount = 10 * 100 + 15 * x;
        }
        else if(units >200 && units<=250){
            int x = units - 200;
            amount = 10*100+15*100+20 * x;
        }
        else {
            int x = units-250;
            amount = 10*100+15*100+20*50+25*x;
        }
        return amount;
    }
}
