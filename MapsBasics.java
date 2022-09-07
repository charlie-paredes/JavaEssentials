import java.util.HashMap;
import java.util.Map;
public class MapsBasics {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Charles"));
        map.put(2, new Person("Dustin"));
        map.put(3, new Person("Justin"));
        map.put(4, new Person("Islam"));
            //places different values at each key
        System.out.println(map);
        System.out.println("size: " + map.size());
        System.out.println("value in key 1: " + map.get(1));
        System.out.println("contains key 4: " + map.containsKey(4));
        System.out.println("all keys: " + map.keySet());
        System.out.println("all entries: " + map.entrySet());
    }
    record Person(String name){}
}
