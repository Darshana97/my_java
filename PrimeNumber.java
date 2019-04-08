import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input the number:");
        int number = sc.nextInt();

        //int number = 15;
        boolean isPrime = true;

        for (int i=2;i<number;i++)
        {
            if (number%i==0)
            {
                isPrime = false;
                break;
            }


        }

        if (isPrime)
            System.out.println("prime number");

        else
            System.out.println("not prime number");


    }
}
