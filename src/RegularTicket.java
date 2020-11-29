public class RegularTicket {
    public String[] specialService = new String[10];

    public RegularTicket(String[] specialService) {
        this.specialService = specialService;
    }

    public String[] getServices() { return specialService; }

    public void addAService(String service) {   }
}
