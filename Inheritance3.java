public class Inheritance3 {

    public static void main(String[] args) {

        B obj = new B(90);


    }
}

class A{

    public A()
    {
        System.out.println("A const");
    }

    public A(int i)
    {
        System.out.println("A const int");
    }
}

class B extends A{

    public B()
    {

        System.out.println("B const");
    }

    public B(int i)
    {

        System.out.println("B const int");
    }
}
