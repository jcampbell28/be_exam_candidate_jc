import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class JsonParser {

    private ArrayList<FullEntry> entries;

    public JsonParser(){
        entries = new ArrayList<>();
    }

    public void loadDataFromFile(String filepath){
        try{
            Scanner scanner = new Scanner(new FileReader(filepath));
            String line;
            FullEntry fullEntry;
            scanner.nextLine();
            while (scanner.hasNextLine());
            line = scanner.nextLine();
            String[] results = line.split(",");
            String id = results[0];
            String firstName = results[1];
            String middleName = results[2];
            String lastName = results[3];
            String phoneNumber = results[4];

            Name name = new Name(firstName, middleName, lastName);
            fullEntry = new FullEntry(id, name, phoneNumber);
            entries.add(fullEntry);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void watchService() {
        try(WatchService service = FileSystems.getDefault().newWatchService()){
            Map<WatchKey, Path> keyPathMap = new HashMap<>();
            Path path = Paths.get("/Users/jessicacampbell/Dev/be_exam_candidate_jc/src/main/resources/input-directory/input.csv");
            keyPathMap.put(path.register(service,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY),
                    path);

            WatchKey watchKey;
            do {
                watchKey = service.take();
            }
                while (watchKey.reset());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
