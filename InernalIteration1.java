import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class InernalIteration1 {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        /*for (int i=0;i<6;i++)
        {
            System.out.println(values.get(i));
        }*/


        /*Iterator<Integer> i = values.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }*/

        /*for (int i: values)
        {
            System.out.println(i);
        }*/

        //values.forEach(i -> System.out.println(i));

        Consumer<Integer> c = new Consumer <Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };

        values.forEach(c);


    }
}
