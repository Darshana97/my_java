import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        //int number = 121;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number: ");
        int number = sc.nextInt();
        int r,sum;
        sum = 0;
        int temp = number;

        while (number>0)
        {
            r = number % 10;
            number = number / 10;
            sum = sum * 10 + r;


        }
        if (sum==temp)
        {
            System.out.println("the number is palindrome");
        }
        else
        {
            System.out.println("the number is not palindrome");
        }


    }
}
