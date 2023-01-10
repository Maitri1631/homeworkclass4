package class4;


//Read 10 numbers from the console entered by the user and print the sum of
//thosenumbers.
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        int num = 0;
        float sum = 0;

        int count = 0;
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter number: ");

        //User enter number and print the sum of those number using while loop
        while (count < 10) {
            int order = count+1;
            System.out.println("Enter number"+ order +": ");
            //num = sc.nextInt();
            boolean a = sc.hasNextInt();
            if (a) {
                int b= sc.nextInt();
                sum+=b;
                count++;
            }
            else {
                System.out.println("Enter number:");
            }
            sc.nextLine();

        }
        System.out.println("Sum of those number is: " + sum + "\n");
        sc.close();
    }
}
