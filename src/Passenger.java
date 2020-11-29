public class Passenger {
    public int passengerId;
    public Contact contact;
    public Address address;
    private static int idCounter;

    static {
        idCounter=0;
    }

    public Passenger(Contact contact, Address address){
        this.passengerId = ++idCounter;
        this.contact = contact;
        this.address = address;
    }

    public int getPassengerId() {
        return passengerId;
    }
}
