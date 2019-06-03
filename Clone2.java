public class Clone2 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Pqr obj = new Pqr();

        obj.x=10;
        obj.y=20;

        Pqr obj1 = (Pqr) obj.clone();
        obj1.y=100;

        System.out.println(obj);
        System.out.println(obj1);


    }
}

class Pqr implements Cloneable{

    int x;
    int y;

    @Override
    public String toString() {
        return "Pqr{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
