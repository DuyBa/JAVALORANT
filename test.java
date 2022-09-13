// Java code to illustrate the containsKey() method
import java.util.*;
  
/**
 * test
 */
public class test {
    public static void main(String[] args)
    {
  
        // Creating an empty Map
        Map<Integer, String> map = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        map.put(10, "Geeks");
        map.put(15, "4");
        map.put(20, "Geeks");
        map.put(25, "Welcomes");
        map.put(30, "You");
  
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);
        System.out.println(map.get(10));

    }
}

