import java.util.Scanner;
public class inCusnsy {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
      System.out.print("Input your Rupee: ");
      Scanner inp = new Scanner(System.in);
      int rup = inp.nextInt();
      float usd = rup*0.0122f;                                     
      System.out.println(rup +" is equal to == "+ usd);
    }
}