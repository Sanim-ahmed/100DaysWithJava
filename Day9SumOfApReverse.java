import java.util.Scanner;

public class Day9SumOfApReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//First number of the series
        int d = sc.nextInt();//Number diff of the series
        int sum =0;

        int i ;
        for (i = a; i >=1; i -=d ) {
            System.out.print(i+" ");
            sum +=i;


        }
        System.out.println();
        System.out.println(sum);

    }
}
