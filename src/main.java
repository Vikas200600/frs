public class main {
    public static void main(String args[]) {
//        Contact contact = new Contact("Vikas", "8892045813", "vikas200600@gmail.com");
//        Address address = new Address("svRoad", "Bengaluru", "Karnataka");
//        Passenger passenger = new Passenger(contact, address);
//        Passenger passenger2 = new Passenger(contact, address);
//        System.out.println(passenger.passengerId);
//        System.out.println(passenger2.getPassengerId());
        Flight flight = new Flight(1,"JAZ",50,5);
        System.out.println(flight.getAirline());
    }
}
