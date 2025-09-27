import java.util.Scanner;
public class Day5SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day :");
        String day = sc.nextLine().toUpperCase();
        switch (day){
            case "SATURDAY" , "SUNDAY" ,"MONDAY" ,"TUESDAY" ->
                    System.out.println("It's a weekday");
                case "WEDNESDAY","THURSDAY" ->
                        System.out.println("It's a weekend");
                case "FRIDAY" ->
                        System.out.println("Jumma bar");
            default -> System.out.println(day + " is not a day :");
        }
    }
}
