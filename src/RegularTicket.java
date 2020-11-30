public class RegularTicket extends Ticket {
    public String[] specialService = new String[10];

    public RegularTicket(int pnrNumber, String departure, String destination, String departureDateAndTime,
                         String arrivalDateAndTime, Flight flight, Passenger passenger, int seatNumber,
                         int durationInMinutes, String status, String[] specialService) {
        super(pnrNumber, departure, destination, departureDateAndTime,
                arrivalDateAndTime, flight, passenger, seatNumber, durationInMinutes, status);
        this.specialService = specialService;
    }

    public String[] getServices() { return specialService; }

    public void addAService(String service) {   }
}
