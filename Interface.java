

interface Abc{

    void show();
}

interface Pqr{

    void xyz();
}

class AbcImpl implements Abc,Pqr{

    public void show()
    {
        System.out.println("in show...");
    }

    @Override
    public void xyz() {
        System.out.println("in xyz...");
    }
}


public class Interface {

    public static void main(String[] args) {

        Abc obj = new AbcImpl();
        obj.show();
        Pqr obj1 = new AbcImpl();
        obj1.xyz();


    }
}
