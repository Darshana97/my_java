public class InnerNested {

    public static void main(String[] args) {

        C c = new C();

        C.D d = new C.D();
        d.call();


    }
}

class C{

    int i;

    static class D{

        public void call()
        {
            System.out.println("helloooooo");
        }
    }
}
