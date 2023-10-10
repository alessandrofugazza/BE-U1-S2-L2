import java.util.Collection;
import java.util.HashMap;

public class Ex3 {
    public static void main(String[] args) {
        HashMap<String, Integer> telephoneBook = new HashMap<>();
    }

    public static void addContact (HashMap<String, Integer> telephoneBook, String name, int phoneNumber) {
        telephoneBook.put(name, phoneNumber);
    }
    public static void removeContact (HashMap<String, Integer> telephoneBook, String name) {
        telephoneBook.remove(name);
    }
    public static void getByPhoneNumber (HashMap<String, Integer> telephoneBook, int searchedPhoneNumber) {
        if (telephoneBook.containsValue(searchedPhoneNumber)) {
            Collection<Integer> phoneNumbers = telephoneBook.values();
            for(int phoneNumber: phoneNumbers) {
                if(searchedPhoneNumber==phoneNumber){
                    
                }
            }
        } else {
            System.out.println("Number not found.");
        }
    }
}
