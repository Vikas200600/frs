public class Address {
    public String street;
    public String city;
    public String state;

    public Address (String street, String city, String state) {
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
