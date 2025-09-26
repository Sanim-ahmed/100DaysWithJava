import java.util.Scanner;
public class Day2LoanInterest {
    public static void main(String[] args) {

      double loanamount;
      double rate;
      int timescompaound;
      int years;
      double amount;

      Scanner sc = new Scanner(System.in);

        System.out.println("Enter the loan amount :");
        loanamount = sc.nextDouble();
        System.out.println("Enter the interset rate (%) :");
        rate = sc.nextDouble()/100;
        System.out.println("Enter the times compaound :");
        timescompaound = sc.nextInt();
        System.out.println("years :");
        years = sc.nextInt();

        amount=loanamount*Math.pow(1+ rate/timescompaound,  timescompaound*years);
        System.out.println("Total amonu you have to give is :" + amount +" tk" );


    }
}
