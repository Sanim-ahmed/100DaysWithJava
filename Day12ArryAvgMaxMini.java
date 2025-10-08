import java.util.Scanner;

public class Day12ArryAvgMaxMini {
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
        System.out.printf("Avg is : %.2f",avg);

        double max = number [0];
        double min = number [0];
        for (int i = 1; i < n ; i++) {

            if(max<number[i]){
                max = number[i];
            }
            if (min>number[i]){
                min=number[i];
            }

        }
        System.out.println("\nMaximum is :"+max);
        System.out.println("Minimum is :"+min);
    }
}
