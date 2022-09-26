import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        boolean isprime = true;
        System.out.print("Plese enter any Natural Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num<1){
            System.out.println("Plese Enter a Number grater than 1!");
        } else {
            if (num%2 ==0){
                System.out.println(num +" Is a Even number");
            }
            else {
                System.out.println(num + " Is Odd Number");
            }
        }
    }
}
