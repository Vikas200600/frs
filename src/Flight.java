public class Flight {
    private int flightNumber;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public  Flight(int flightNumber, String airline, int capacity, int seatsBooked) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.seatsBooked = seatsBooked;
    }

    public Flight(Flight flight) {
        this.flightNumber = flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.seatsBooked = flight.seatsBooked;
    }

    public int getFlightNumber() { return flightNumber; }

    public int getCapacity() { return capacity; }

    public String getAirline() { return airline; }

    public  int getSeatsBooked() { return seatsBooked; }
}
