package Calculate;

public class Calculator {

    //instance method
    public void addition(int a,int b){
        int result =a+b;
        System.out.println("Addition is:   "+result);
    }
    public void subtraction(int a, int b){
        int result1 = a-b;
        System.out.println("Subtraction is:  "+result1);
    }

    public void multiplication(int a, int b){
        int result3 = a*b;
        System.out.println("Multiplication is:  "+result3);
    }

    public void division(int a, int b){
        int result4 = a/b;
        System.out.println("Division is:    "+result4);
    }

    public void calculateResult(int a, int b, char symbol){

        switch(symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Invalid symbol");
        }
       
    }

}
