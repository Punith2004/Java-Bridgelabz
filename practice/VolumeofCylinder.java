import java.util.Scanner;
public class VolumeofCylinder{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius=input.nextDouble();
        System.out.print("Enter the height:");
        double height=input.nextDouble();
        double Volume=Math.PI*radius*radius*height;
        System.out.print(Volume);
    }
}