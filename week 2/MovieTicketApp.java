import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1;
        this.price = 0.0;
        this.isBooked = false;
    }

    public void bookTicket(int seatNumber, double price) {
        if (isBooked) {
            System.out.println("Ticket is already booked!");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        }
    }

    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }

    public boolean isBooked() {
        return isBooked;
    }
}

public class MovieTicketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine();

        MovieTicket ticket = new MovieTicket(movieName);

        while (true) {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (!ticket.isBooked()) {
                        System.out.print("Enter seat number: ");
                        int seatNumber = scanner.nextInt();
                        System.out.print("Enter ticket price: ");
                        double price = scanner.nextDouble();
                        ticket.bookTicket(seatNumber, price);
                    } else {
                        System.out.println("Ticket is already booked!");
                    }
                    break;

                case 2:
                    ticket.displayTicketDetails();
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
