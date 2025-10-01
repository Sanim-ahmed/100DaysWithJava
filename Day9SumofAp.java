import java.util.Scanner;

public class Day9SumofAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//First number of the series
        int d = sc.nextInt();//Number diff of the series
        int n = sc.nextInt();//last number of ther series
        int sum =0;

        int i ;
        for (i = a; i < n; i +=d ) {
            System.out.print(i+" ");
            sum +=i;


        }
        System.out.println();
        System.out.println(sum);
    }
}
