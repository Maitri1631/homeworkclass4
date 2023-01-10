package class4;


///Write a programme to input any number and check if it is prime or not.

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        int i=1,c=0;

        //Check input number prime or not
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }

        if(c==2)
        {
            System.out.println(n+" is a PRIME no");
        }
        else
        {
            System.out.println(n+" is a NOT a prime no");
        }
    }
}
