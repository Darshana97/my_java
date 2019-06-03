public class Inheritance4 {

    public static void main(String[] args) {

        C obj = new C();
        new C().k=99;
        new C().show();

    }
}

class C{

    int k;

    public void show()
    {

        System.out.println(k);
    }
}
