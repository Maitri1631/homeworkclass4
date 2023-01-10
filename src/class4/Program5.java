package class4;

//Write a program in Java to display the pattern like a triangle with a number.
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        //print triangle
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
