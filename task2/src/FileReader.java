import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class FileReader {
    public static String readFileIntoString(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}