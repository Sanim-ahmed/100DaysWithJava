import java.util.Scanner;

public class Day8SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i += 2) {
            System.out.print(i+" ");
            sum += i;

        }

        System.out.println("\nTotal sum of odd numbers: " + sum);
    }
}
