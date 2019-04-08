import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();

        //int number = 28;


        boolean b = isPerfect(number);

        if (b)
            System.out.println("number is perfect");
        else
            System.out.println("number is not perfect");


    }

    public static boolean isPerfect(int number)
    {
        int sum = 0;

        for (int i=1;i<number;i++)
        {
            if (number%i==0)
                sum = sum+i;

        }

        if (sum==number)
            return true;

        return false;
    }
}


