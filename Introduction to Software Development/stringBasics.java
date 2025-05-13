public class Main {
    public static void main(String[] args) {
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int numberOfTickets =8;
        double pricePerTicket = 10.57;

        double totalPriceOfTickets = numberOfTickets * pricePerTicket;
        String username= firstName.toLowerCase()+ lastName.toLowerCase();
        String movieName = movieTitle.toUpperCase();
        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println("Username: "+ username);
        System.out.println("Movies: "+ movieName);
        System.out.println("Number of Tickets: "+ numberOfTickets);
        System.out.println("Price oer ticket: "+ pricePerTicket);
        System.out.println("Total price of 8 tickets: "+ totalPriceOfTickets+"\n");
        System.out.println("Thank you fo choosing us fo booking your movie tickets");
        System.out.println("Enjoy your movie!!");

    }
}
