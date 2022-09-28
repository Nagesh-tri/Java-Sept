import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
      //To find out whether the given String is Palindrome or not.
      System.out.print("Enter your string:");
      Scanner inp = new Scanner(System.in);
      String pl = inp.nextLine();
      int j = pl.length()-1;
      boolean isPl = true;
      for(int i=0;i<=j;i++){
        if(pl.charAt(i)!= pl.charAt(j)){
          isPl =false;
          break;
        }
        j=j-1;
      }
      if(isPl){
        System.out.print("Given str is a Palindrome.");
      } else{
        System.out.print("Given str is a Palindrome.");
      }
    }
}