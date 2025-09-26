//Test comment for step 17. in lab 3
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        } else {
            throw new IllegalArgumentException("Cannot add null buddy");
        }
    }

    public void buddySpeak(String saysum){
        System.out.println(saysum);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
