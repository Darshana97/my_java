import java.util.Vector;

public class Vector_Arrlist {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();

        v.add(4);
        v.add(11);
        v.add(10);
        v.add(4);
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(4);
        v.add(9);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(10);
        v.add(4);
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(4);
        v.add(9);
        v.add(4);
        v.remove(1);


        System.out.println(v.capacity());

        for (int i:v) {

            System.out.println(i);

        }


    }


}
