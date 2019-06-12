import java.util.Scanner;

public class Overloading {

    public static void main(String[] args) {

        A obj = new A();
        obj.show(100);


    }
}

class A{

    public void show()
    {
        System.out.println("method show B");
    }

    public void show(int a)
    {
        System.out.println("method show B with integer");
    }
}