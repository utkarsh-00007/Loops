import java.util.Scanner;
//half pyramid pattern

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows upto which you want to print Half pyramid pattern pattern : ");
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println(" ");
        }
    }
}
