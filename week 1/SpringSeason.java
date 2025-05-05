import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Month must be between 1 and 12.");
            return;
        }
        if (day < 1 || day > 31) {
            System.out.println("Invalid day. Day must be between 1 and 31.");
            return;
        }
        
      
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("Invalid day for the given month.");
            return;
        }
        if (month == 2 && day > 28) {
            System.out.println("Invalid day for February. Assuming non-leap year.");
            return;
        }
        
        String result = checkSpringSeason(month, day);
        System.out.println(result);
        
        scanner.close();
    }

    public static String checkSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return "Its a Spring Season";
        } else {
            return "Not a Spring Season";
        }
    }
}
