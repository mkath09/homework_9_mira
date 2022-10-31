package calculate;

import java.util.Scanner;

/*
Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / : ");
        char ch = scanner.next().charAt(0);

        Calculator obj = new Calculator();
        obj.calculateResult(a ,b, ch);
        System.out.println("Would you like to do more calculation ");
        char result = scanner.next().charAt(0);

        while (result == 'y' || result == 'y') {//while (result == 'y' || result == 'y')
            System.out.println("Enter the first number: ");
            int a1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int a2 = scanner.nextInt();
            System.out.println("Enter one of the symbol +,*,-,/ ");
            char ch1 = scanner.next().charAt(0);
            //char result2 = scanner.next().charAt(0)
            //while ( result2 == 'y' || result2 == 'y')

            break;
        }
        }


        }










