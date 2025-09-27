import java.util.Scanner;
public class Day5BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char ch;
        double result = 0;
        boolean validop = true;
        System.out.println("Enter first number :");
        num1 = sc.nextDouble();
        System.out.println("Enter a oparator :");
        ch = sc.next().charAt(0);
        System.out.println("Enter Second number :");
        num2 = sc.nextDouble();

        switch (ch) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("You can not devied by 0");
                    validop = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid oparator");
                validop = false;
            }

        }

        if (validop) {
            System.out.println("the result is :" + result);
        }
    }
}

