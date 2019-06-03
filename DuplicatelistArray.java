import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatelistArray {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("darshana");
        names.add("bandara");
        names.add("pubudu");
        names.add("bandara");
        names.add("darshana");

        Set<String> s = new HashSet<>();

        for (String name: names)
        {
            if (s.add(name)==false)
                System.out.println(name);
        }
    }
}
