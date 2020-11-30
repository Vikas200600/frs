public class Passenger {
    private int passengerId;

    private static class Contact {
        private String name;
        private String phoneNumber;
        private String email;

        public Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getContact() {
            return "Name: " + this.name + " Phone Number: " + this.phoneNumber + " Email: " + this.email;
        }

        public void updateContact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
    }
    private Contact contact;

    private static class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getAddress() {
            return "Street: " + this.street + "City: " + this.city + "State: " + this.state;
        }

        public void updateAddress(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static int idCounter;

    static {
        idCounter=0;
    }

    public Passenger(Contact contact, Address address){
        this.passengerId = ++idCounter;
        this.contact = contact;
        this.address = address;
    }

    public int getPassengerId() { return passengerId; }
}
