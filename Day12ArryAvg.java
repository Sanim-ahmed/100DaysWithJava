import java.util.Scanner;

public class Day12ArryAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers :");
        int n = sc.nextInt();
        System.out.printf("Enter %d numbers :",n);
        double[]number=new double[n];
        double sum = 0;
        for (int i = 0; i<number.length;i++){
            number[i]= sc.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum+number[i];

        }
        System.out.println("Sum is :"+sum);
        double avg = sum/number.length;
        System.out.println("Avg is :"+avg);

    }
}
