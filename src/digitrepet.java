import java.util.Scanner;

public class digitrepet {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number check for Repetation: ");
        int rt = sc.nextInt();
        sc.close();
        int cont =0;
        while(num%10>0){
            if(num%10==rt){
               cont++;
            }
            num=num/10;
        }
        System.out.println("Number "+rt+" is comes: "+cont+" times.");
    }
    
}
