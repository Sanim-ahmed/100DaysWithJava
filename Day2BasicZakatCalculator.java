import java.util.Scanner;
public class Day2BasicZakatCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Assalamu alaikum " + name + ", you are under age. Zakat is not required.");
            return;}

        System.out.println("Enter your networth without debth  and equal to nishab  (105924 tk):");
        int networth = sc.nextInt();

        double zakat = networth*(2.5/100);

            double nisab = 105924;

           if (nisab >= networth){
               System.out.printf("Assalamu alaikum %s,apnr upor jaka foroz noy",name);
           }else{
               System.out.printf("Assamalu alaikum %s,apnr zakat er proriman %f tk",name,zakat);
           }


    }
}
