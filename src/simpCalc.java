import java.util.Scanner;

public class simpCalc {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
       System.out.println("Enter Tweo numbers: ");
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        System.out.println("Enter your operator(+, -, *, /): ");
        char op = inpt.next().charAt(0);
        if (op =='+'){
            System.out.println("Result of summision operator is: "+ (a+b));
        } else if (op=='-') {
            System.out.println("Result of subtraction operator is: "+ (a-b));
        } else if (op=='*'){
            System.out.println("Result of multipication operator is: "+ (a*b));
        } else if (op =='/'){
            System.out.println("Result of division operator is: "+ (a/b));
        } else {
          System.out.print("Enter a valid Operator!!");
        }
    }
}
   