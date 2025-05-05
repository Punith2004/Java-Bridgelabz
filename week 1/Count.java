import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int digits = input.nextInt();
        int count = 0;
        int temp = digits;

        if (digits == 0) {
            count = 1; 
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("The count of the digits is: " + count);
    }
}
