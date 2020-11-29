public class TouristTicket {
    public Address hotelAddress;
    public String[] touristPlaces = new String[5];

    public TouristTicket(Address address, String[] touristPlaces) {
        this.hotelAddress = address;
        this.touristPlaces = touristPlaces;
    }

    public void addATouristPlaces(String place) {    }

    public void removeATouristPlaces(String place) {    }

}
