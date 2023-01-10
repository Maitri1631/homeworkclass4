package Java_homework;


//Re write the student mark sheet program using if else and while loop.
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input student information
        System.out.println("Enter Student Name:");
        String name=sc.nextLine();

        System.out.println("Enter Roll No: ");
        String rn=sc.nextLine();

        System.out.println("Enter marks for math, sai, and eng: ");
        int math=sc.nextInt();
        int sci=sc.nextInt();
        int eng=sc.nextInt();

        while(math<0 || math > 100 ||sci<0 ||sci>100||eng <0||eng >100){

            System.out.println("Invalid Input marks should be between 0 ans 100");
            System.out.println("Enter Marks for math,sci,eng");

            math=sc.nextInt();
            sci=sc.nextInt();
            eng=sc.nextInt();
            

        }
        int total = math + sci + eng;
        double per = (total / 300.0) * 100;
        String grade = null;

        if (per < 25) {
            System.out.println("Your Grade is:  F");
        } else if ((per >= 25) && (per< 45)) {
            System.out.println("Your Grade is:  E");

        } else if ((per >= 45) && (per < 50)) {
            System.out.println("Your Grade is:  D");

        } else if ((per >= 50) && (per < 60)) {
            System.out.println("Your Grade is:  c");

        } else if ((per >= 60) && (per < 80)) {
            System.out.println("Your Grade is:  B");

        } else if ((per >= 80 && (per< 100))) {
            System.out.println("Your Grade is:  A");
            // System.out.println("Your grade is:     " + grade);
        }
        else {
            System.out.println("Invalid grade");
        }



    }

}
