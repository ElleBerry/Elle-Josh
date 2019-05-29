import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContactsManager {

    public static void main(String[] args) {
        Input input = new Input;
//        HashMap<String ,ArrayList<menuItem>> menu = new HashMap<>();
//        menu.put("1. View Contacts",new ArrayList<>());
//        menu.put("2. Add a new contacts",new ArrayList<>());
//        menu.put("3. Search by contact name",new ArrayList<>());
//        menu.put("4. Delete an existing contact",new ArrayList<>());
//        menu.put("5. Exit",new ArrayList<>());

        String directory = "data";

        Path folder = Paths.get("data");
        Path file = Paths.get(directory, "contacts.txt");
        System.out.println("Enter a number");
if(input.getString(""))
        if (Files.notExists(folder)) {
            try {
                Files.createDirectories(folder);
                System.out.println(folder + " was created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (Files.notExists(file)) {
            try {
                Files.createFile(file);
                System.out.println(file + " was created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(file + " File already exists");
        }

        List<String> contact = Arrays.asList("Name     | Phone Number\n", "Contact 1|123456789\n","Contact 2|123456789\n","Contact 3|123456789\n","Contact 4|123456789\n");

        try {
            Files.write(file, contact);
            System.out.println(contact);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
