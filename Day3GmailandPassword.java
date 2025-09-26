import java.util.Scanner;
public class Day3GmailandPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        String domain;
        String password;

        System.out.println("Assalmu alaikum sir\nEnter your gmail :");
        String gmail = sc.nextLine();
        if (gmail.contains("@gmail.com")){
            System.out.println("Enter password: ");
            password = sc.nextLine();
            if (password.contains("01234")){
                username = gmail.substring(0 , gmail.indexOf("@"));
                domain = gmail.substring(gmail.indexOf("@")+1);
                System.out.println(" Your username is :" +username);
                System.out.println("Domain is :" +domain);
            }else {
                System.out.println("wrong password");
            }

        }else {
            System.out.println("Your gmail must contian @gmail.com");
        }

    }
}