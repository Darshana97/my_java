public class InnerMember {

    public static void main(String[] args) {

        A a = new A();

        A.B b = a.new B();
        b.show();


    }
}

class A{

    int rollno;
    String name;

    class B{

        public void show()
        {
            System.out.println("hellooo");
        }

    }
}
