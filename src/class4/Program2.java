package class4;

//-Read the numbers from the console entered by the user and print the
//minimumand maximum number the user has entered.

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //user enter number and print the maximumm and minimum number using while loop
        while(true) {
            System.out.print("Enter number: ");

            if(sc.hasNextInt()) {
                int number = sc.nextInt();
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }
            sc.nextLine();
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        sc.close();

    }
    }

