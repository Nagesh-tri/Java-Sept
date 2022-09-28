import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    // To calculate Fibonacci Series up to n numbers.
    System.out.println("Enter a number");
    Scanner inp = new Scanner(System.in);
    int num = inp.nextInt();
    int num1 = 0;
    int num2 = 1;
    int tempv = 0;
    System.out.print(num1);
    for (int i = 0; i < num; i++) {
      System.out.print(", " + num2);
      tempv = num1 + num2;
      num1 = num2;
      num2 = tempv;
    }
  }
}