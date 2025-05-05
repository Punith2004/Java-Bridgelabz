import java.util.Scanner;

public class MobileRecords {
    static class MobileNumber {
        private String mobileNumber;

        
        public MobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        
        public void displayInfo() {
            System.out.println("Mobile Number: " + mobileNumber);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobileNumber[] records = new MobileNumber[5]; // You can increase this as needed

        
        for (int i = 0; i < records.length; i++) {
            System.out.print("Enter mobile number for person " + (i + 1) + ": ");
            String number = scanner.next();
            records[i] = new MobileNumber(number);
        }

        scanner.close();

        
        System.out.println("\nStored Mobile Numbers:");
        for (MobileNumber record : records) {
            record.displayInfo();
        }
    }
}
