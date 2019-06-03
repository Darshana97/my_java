public class InnerLambda {

    public static void main(String[] args) {

        X x = () -> {

                System.out.println("hellooooo");

        };

        x.shoow();

    }
}

interface X{

    void shoow();
}
