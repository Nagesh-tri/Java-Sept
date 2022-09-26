import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        boolean isprime = true;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ctn = 2;
        while (ctn*ctn<= num){
            if (num%ctn == 0){
                isprime = false;
                break;
            }
            ctn = ctn+1;
        }
        if( num==1 || num==0){
            System.out.println("neither a prime nor a comosite");
        } else if (num< 0) {
            System.out.println("not a Natural number");
        } else {
            if (isprime == true ){
                System.out.println(num + " Is a Prime number.");
            } else {
                System.out.println(num + " Is not a Prime number.");
            }
        }


    }
}
