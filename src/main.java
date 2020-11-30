public class main {
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNumber());
    }

    public static void main(String args[]) {
        Passenger passenger = new Passenger("Vikas", "8892045813", "vikas200600@gmail.com", "svRoad", "Bengaluru", "Karnataka");
        Flight flight = new Flight(1,"JAZ",50,5);
        String[] specialService = new String[]{"food","drink"};
        RegularTicket regularTicket = new RegularTicket(1, "Benagaluru", "Mumbai", "01/12/2020 10:00", "01/12/2020 12:00", flight, passenger, 1,120, "Confirmed", specialService);
        String[] touristPlace = new String[]{"a", "b", "c"};
        TouristTicket touristTicket = new TouristTicket(2, "Benagaluru", "Mumbai", "01/12/2020 10:00", "01/12/2020 12:00", flight, passenger, 1,120, "Confirmed", "Mumbai", touristPlace);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
}
