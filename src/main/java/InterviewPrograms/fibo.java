package InterviewPrograms;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fibonacci series");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println("The fibonnaci series for number "+ number + "is ");
		
		for(int i=1;i<=number;i++) {
			System.out.println(fibonacci(i) + " ");
		}
		
	}
	
	//using loop and iteration
	public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
           
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
          
        }
        return fibonacci; //Fibonacci number
      
    }  
	
	//using tail recursion
	public static int fibonacci(int number) {
		
		if(number == 1 || number == 2) {
			return 1;
		}
		
		int result=  fibonacci(number-1) + fibonacci(number-2);
		return result;
	}
	
	public static int fibo(int number) {
		
		if(number == 1 || number == 2) {
			return 1;
		}
		int fibo=1,f1=1,f2=1;
		for(int i=3;i<=number;i++) {
			
			fibo = f1+f2;
			f1=f2;
			f2=fibo;
		}
		
		return fibo;
	}

}
