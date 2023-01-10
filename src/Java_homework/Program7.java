package Java_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Program7 {

    public static void main(String[] args) {
        HashMap<String,Integer> People=new HashMap<String,Integer>();

        // Add keys and values (Name, age)
        People.put("Maitri",26);
        People.put("karan",28);
        People.put("Darshit",30);
        People.put("Mit",20);
        People.put("Tanvi",26);

        // for-each loop to iterate through the values in the map
        for (Integer age : People.values()) {
            System.out.println(age);
        }

        System.out.println("\n");

        // for-each loop to iterate through the keys in the map
        for (String name : People.keySet()) {
            System.out.println(name);
        }

        System.out.println("\n");
        // for-each loop to iterate through the key-value pairs in the map
        for (Map.Entry<String, Integer> entry : People.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
