import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Navis", "9840855590");
        phoneBook.put("Freesie", "9500027515");

        for (String name : phoneBook.keySet()) {
            System.out.println(name + " " + phoneBook.get(name));
        }

        // Entry is interface is inside the Map interface.

        Set<Map.Entry<String, String>> values = phoneBook.entrySet();
        for (Map.Entry<String, String> e : values) {
            System.out.println(e.getKey() + "  " + e.getValue());
            // e.setValue("III");
        }

    }
}
