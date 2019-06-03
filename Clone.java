public class Clone {

    public static void main(String[] args) {

        Abc obj = new Abc();

        obj.i=5;
        obj.j=6;

        //shallow copy
        /*Abc obj1 = obj;
        obj1.j=8;*/


        //deep copy
        Abc obj1 = new Abc();
        obj1.i=obj.i;
        obj1.j=obj.j;
        obj.i=8;

        System.out.println(obj);
        System.out.println(obj1);


    }
}

class Abc{

    int i;
    int j;

    @Override
    public String toString() {
        return "Abc{i=" + i + ", j=" + j + "}";
    }
}
