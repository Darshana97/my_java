import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("name","darshana");
        map.put("actor","john");
        map.put("ceo","marisha");
        map.put("actor","kevin");

        /*System.out.println(map);
        System.out.println(map.get("name1"));*/

        Set<String> keys = map.keySet();

        for (String key: keys)
        {
            System.out.println(key + " " + map.get(key));
        }
    }
}
