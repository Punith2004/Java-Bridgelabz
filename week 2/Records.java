import java.util.Scanner;
public class Records {
    static class MedicalRecords {
        private int medicalRecordNumber;
		public MedicalRecords(int medicalRecordNumber) {
            this.medicalRecordNumber = medicalRecordNumber;
        }

        
        public void displayInfo() {
            System.out.println("Medical Record Number: " + medicalRecordNumber);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MedicalRecords[] records = new MedicalRecords[20];

       
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter medical record number for patient " + (i + 1) + ": ");
            int recordNumber = scanner.nextInt();
            records[i] = new MedicalRecords(recordNumber);
        }

        
        scanner.close();

        
        System.out.println("\nMedical Records:");
        for (MedicalRecords record : records) {
            record.displayInfo();
        }
    }
}
