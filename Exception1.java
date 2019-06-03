public class Exception1 {

    public static void main(String[] args) {

        int x,y,z = 0;

        x=8;
        y=0;

        try {

            z=x/y;
            
        }catch(ArithmeticException e){

            System.out.println(e);

        }
        System.out.println(z);

    }
}
