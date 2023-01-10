package Java_homework;

import java.util.ArrayList;

public class Program10 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();


        name.add("Maitry");
        name.add("Hetvi");
        name.add("Sheetal");
        name.add("Maulik");
        name.add("Minesh");
        name.add("Jiten");
        name.remove("minesh");
        name.remove(4);

        //iterate through the array using for each loop
        for (String names : name) {
            System.out.println(name);
        }

    }

}
