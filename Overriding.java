public class Overriding {

    public static void main(String[] args) {

        B obj = new B();
        obj.show();

    }
}

class A{

    public void show()
    {
        System.out.println("show method A");
    }
}

class B extends A{

    public void show()
    {
        System.out.println("show method B");
    }


}
