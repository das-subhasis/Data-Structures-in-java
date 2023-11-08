import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> menu = new HashMap<>();

        // Adding elements to the hashmap
        menu.put("Dosa",200);
        menu.put("Idli",120);
        menu.put("Paratha thali",220);

        // Printing the price of the food based on it's dish (key value)
        System.out.println(menu.get("Paratha thali"));

        // Checking whether the menu contains "Idli" in its item list
        if(menu.containsKey("Idli")){
            System.out.println("Idli is in the menu");
        }

        // Printing each entry in the hashmap (method - 1)
        for(Map.Entry<String, Integer> e : menu.entrySet()){
            System.out.println(String.format("%s %d ",e.getKey(),e.getValue()));
        }

        // Returns an array of keys
        System.out.println(menu.keySet());

        // method - 2
        for(String key : menu.keySet()){
            System.out.println(String.format("%s %d",key,menu.get(key)));
        }

        System.out.println(menu.values());
        // method - 3
        for(int values : menu.values()){
            System.out.println(values);
        }
    }
}
