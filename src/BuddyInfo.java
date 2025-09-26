public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo("Homer","123 Library Rd","123-456-7890");
        System.out.println("Hello " + bud.getName() + "!");
    }
}

