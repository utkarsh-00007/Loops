//# factorial
//This will provide factorial of number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial : ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = n; i>0;i--){
            factorial = factorial*i;
        }
        System.out.println("The factorial of "+ n+ " is : "+ factorial);
    }
}
