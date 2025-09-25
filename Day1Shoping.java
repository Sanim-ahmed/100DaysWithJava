import java.util.Scanner;
public class Day1Shoping {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Apni ki niyechen :");
        String name2 = sc.nextLine();

        if (!name2.equalsIgnoreCase("chips") && !name2.equalsIgnoreCase("chanachur")) {
            System.out.println("The product is not available");
            return;
        }
        System.out.print("Size :");
        String name3 = sc.nextLine();
        System.out.print("koyta :");
        int quantity = sc.nextInt();
        int total =0;

        if( name2.equalsIgnoreCase("chips") && name3.equalsIgnoreCase("small")){
            total=30*quantity  ;
        }else if ( name2.equalsIgnoreCase("chips") && name3.equalsIgnoreCase("big"))
        { total=60*quantity  ;}

        else if ( name2.equalsIgnoreCase("chanachur") && name3.equalsIgnoreCase("big"))
        {
            total = 70*quantity ;}

        else {System.out.println("ai size nei");
            return;
        }
        System.out.println("\nAssalamu alaikum " + name + " sir, apner total hoyechy " + total + " tk");

        System.out.println("Apni koto tk diyechen :");
        int paid = sc.nextInt();
        if ( paid == 0){
            System.out.println("aj nogod kal baki");
        }
        else if (paid >= total){
            int change = paid - total;
            System.out.println("anpi paben " + change + " tk" );
        } else if (total >= paid) {
            int due = total -paid;
            System.out.println("apnaky aro " + due + " tk dity hoby" );
        }
    }
}
