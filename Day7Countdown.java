import java.util.Scanner;

public class Day7Countdown {
    public static void main(String[] args)throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Countdown starts from? :");
        int count = sc.nextInt();

        for (int count = 10;i >0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("EID MUBARAK");
    }
}
