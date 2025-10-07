import java.util.Scanner;

public class Day10_EndOfApGP {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int start = sc.nextInt();   // first term
                int diff = sc.nextInt();    // common difference
                int n = sc.nextInt(); // number of terms

                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    int current = start + (i - 1) * diff;

                    if (i % 2 == 0) {
                        System.out.print(-current + " ");
                        sum -= current;
                    } else {
                        System.out.print(current + " ");
                        sum += current;
                    }
                }

                System.out.println("\nSum of series up to " + n + " terms = " + sum);
            }
        }

