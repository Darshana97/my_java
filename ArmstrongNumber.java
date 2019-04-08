public class ArmstrongNumber {

    public static void main(String[] args) {
        
        int number = 154;
        int r;
        int sum = 0;
        int temp = number;
        
        while (number>0)
        {
            r = number % 10;
            number = number / 10;
            sum = sum  + r*r*r;
            
        }
        if (temp==sum)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not armstrong number");
        }


    }

    
}
