package Java_homework;

import java.util.ArrayList;

//Write a Java program to create a new array list, add some colours(string) and
//printout the collection using for each loop.
public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Red");
        System.out.print(color);
    }
}
