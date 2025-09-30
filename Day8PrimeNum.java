import java.util.Scanner;
 public class Day8PrimeNum {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int num = sc.nextInt();
         boolean isprime = true;
         for (int i = 2; i < num/2; i++) {
             if(num%i == 0){
             isprime =false;
             break;}

         }if (isprime){
             System.out.printf("%d number is a prime number",num);
         }else {
             System.out.printf("%d number is not prime number",num);
         }
           sc.close();
     }
}