public class TouristTicket extends Ticket{
    public String hotelAddress;
    public String[] touristPlaces = new String[5];

    public TouristTicket(int pnrNumber, String departure, String destination, String departureDateAndTime,
                         String arrivalDateAndTime, Flight flight, Passenger passenger, int seatNumber,
                         int durationInMinutes, String status, String address, String[] touristPlaces) {
        super(pnrNumber, departure, destination, departureDateAndTime,
                arrivalDateAndTime, flight, passenger, seatNumber, durationInMinutes, status);
        this.hotelAddress = address;
        this.touristPlaces = touristPlaces;
    }

    public void addATouristPlaces(String place) {    }

    public void removeATouristPlaces(String place) {    }

}
