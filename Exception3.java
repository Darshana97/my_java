import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception3 {

    public static void main(String[] args) {

        int x,y,z=0;



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x=10;

        try {

            y=Integer.parseInt(br.readLine());
            z=x/y;
            System.out.println("output is: "+z);

        }catch (IOException e){

            System.out.println("some io error");

        }catch (ArithmeticException e){

            System.out.println("cannot divide by zero"+e);

        }
        finally {

            System.out.println("BYE");
        }




    }
}
