import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int a=1,b=1;
        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        System.out.print("1 1 ");

        while (k<=n)
        {
            k=a+b;
            System.out.print(k+ " ");
            a=b;
            b=k;
        }

    }


}
