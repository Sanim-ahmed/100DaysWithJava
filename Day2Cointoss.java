import java.util.Scanner;
import java.util.Random;
public class Day2Cointoss {
    public static void main(String[] args) {
        System.out.println("Let's toss \n");

     Scanner sc= new Scanner(System.in);
     String what = sc.nextLine();
     if (!what.equalsIgnoreCase("ok")){
         return;
     }
     Random ran = new Random( );
         boolean isHead = ran.nextBoolean();
        if (isHead){
            System.out.println("\nIt's a Head");
        }else{
            System.out.println("\nIt's a Tail");
        }
    }
}
