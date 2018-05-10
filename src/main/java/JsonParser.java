import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class JsonParser {

    public static void main(String[] args) {
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
                Path eventDir = keyPathMap.get(watchKey);
            }
                while (watchKey.reset());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
