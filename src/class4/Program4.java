package class4;

//Digit Sum Challenge
public class Program4 {
    public static int sumDigits(int number) {
        if(number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(127));  // should return 10
        System.out.println(sumDigits(1));  // should return -1
        System.out.println(sumDigits(-15));  // should return -1
        System.out.println(sumDigits(123456));  // should return 21
        System.out.println(sumDigits(0));  // should return -1
    }
}
