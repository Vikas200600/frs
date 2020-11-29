public class Contact {
    public String name;
    public String phoneNumber;
    public String email;

    public Contact (String name, String phoneNumber, String email) {
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
