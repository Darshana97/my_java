public class Exception2 {

    public static void main(String[] args) {

        int a[] = new int[5];

        try {

            for (int i=0;i<=5;i++)
            {
                a[i] = i+1;

            }
        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("maximum value is 5");
        } catch (Exception e){

            System.out.println("helooooooo");
        }


    }
}
