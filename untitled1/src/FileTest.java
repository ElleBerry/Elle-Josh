import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileTest {

    public static void main(String[] args) {
        String directory = "data";

        Path folder = Paths.get("data");
        Path file = Paths.get(directory, "contacts.txt");

        if(!Files.notExists(folder)) {
            try {
                Files.createDirectories(folder);
                System.out.println(folder + " was created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String contacts="Contact 1"+"|"+"123456789";
        String title="Name | Phone Number";

        List<String> contact = Arrays.asList(title+contacts+);

        try{
            Files.write(file, contact);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
