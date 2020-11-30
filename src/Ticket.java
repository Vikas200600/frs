public class Ticket {
    private int pnrNumber;
    private String departure;
    private String destination;
    private String departureDateAndTime;
    private String arrivalDateAndTime;
    private Flight flight;
    private Passenger passenger;
    private int seatNumber;
    private int durationInMinutes;
    private String status;

    public Ticket(int pnrNumber, String departure, String destination, String departureDateAndTime,
                  String arrivalDateAndTime, Flight flight, Passenger passenger, int seatNumber,
                  int durationInMinutes, String status) {
        this.pnrNumber = pnrNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureDateAndTime = departureDateAndTime;
        this.arrivalDateAndTime = arrivalDateAndTime;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.durationInMinutes = durationInMinutes;
        this.status = status;
    }

    public int getPnrNumber() { return pnrNumber; }

    public void cancelTicket() { this.status = "Cancelled"; }
}
