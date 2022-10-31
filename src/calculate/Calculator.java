package calculate;
//Create two class with name “Calculator” and “Main”
public class Calculator {

   public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int a = 20;
        int b = 10;
        char symbol = 0;

    calculator.calculateResult(a,b,symbol);

    }

    public void addition(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public void division(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a);
        System.out.println(b);

    }

    public void calculateResult(int a, int b, char symbol) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("symbol");
    }



    }
