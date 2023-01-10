package Java_homework;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class Program5 {
    public static void main(String[] args) {
        // Create an empty ArrayList.
        ArrayList myArrayList = new ArrayList();

        // Test whether the array is empty or not.
        if (myArrayList.isEmpty())
        {
            System.out.println("The ArrayList is empty");
        }
        else
        {
            System.out.println("The ArrayList is not empty");
        }
    }
}
