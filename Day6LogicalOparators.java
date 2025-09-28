import java.util.Scanner;
public class Day6LogicalOparators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user name :");
        String username = sc.nextLine();

        if(username.length()  < 4 || username.length() > 9 ){
            System.out.println("username must between  (4 to 9) words .");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("username must not contains spaces or underscor .");
        }else {
            System.out.println("Assalamu alaikum " + username);
        }
        sc.close();
    }

    }
