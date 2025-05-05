import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();
        double areaInInches = 0.5 * base * height;
        double baseCm = base * 2.54;
        double heightCm = height * 2.54;
        double areaInCm = 0.5 * baseCm * heightCm;
        double heightFeet = height / 12;
        
       
        System.out.println("The area of the triangle in square inches is: " + areaInInches);
        System.out.println("The area of the triangle in square cm is: " + areaInCm);
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + height);
        
        scanner.close();
    }
}