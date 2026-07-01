import java.util.*;

public class AddressBook {

    static ArrayList<Contact> list = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void add(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate Phone Number");
            return;
        }

        Contact c = new Contact(name, phone, email);

        list.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added");
    }

    static void search(String name) {

        if (map.containsKey(name)) {
            Contact c = map.get(name);
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    static void delete(String name) {

        if (map.containsKey(name)) {
            Contact c = map.get(name);

            list.remove(c);
            map.remove(name);
            phoneSet.remove(c.phone);

            System.out.println("Contact Deleted");
        } else {
            System.out.println("Contact Not Found");
        }
    }

    static void display() {

        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nContacts:");

        for (Contact c : list) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        }
    }

    public static void main(String[] args) {

        add("Shobhit", "9876543210", "shobhit@gmail.com");
        add("Aman", "9999999999", "aman@gmail.com");
        add("Rahul", "8888888888", "rahul@gmail.com");

        search("Aman");

        delete("Rahul");

        display();
    }
}