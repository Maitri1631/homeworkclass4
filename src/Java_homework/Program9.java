package Java_homework;

import java.util.ArrayList;

//Write program and add all group names in to array and iterates through for
//each loop.
public class Program9 {
    public static void main(String[] args) {
        //Create array list for group name
        ArrayList<String> group = new ArrayList<>();


        group.add("Postman");
        group.add("Rest Assured");
        group.add("Java");
        group.add("Selenium");
        group.add("Selenium123");
        group.add("Java1");
        group.remove("java1");
        group.remove(4);

        //iterate through the array using for each loop
        for (String groups : group) {
            System.out.println(group);
        }

    }
}
