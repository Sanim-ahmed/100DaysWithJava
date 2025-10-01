import java.util.Scanner;

public class Day9SumOfGpReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//First number of the series
        int d = sc.nextInt();//Number diff of the series
        int n = sc.nextInt();//last number of ther series
        int sum =0;

         ;
        for (int i = a; i >= n;  ) {
            System.out.print(i+" ");
            sum +=i;
            i /=d;
        }
        System.out.println();
        System.out.println(sum);
    }
}
