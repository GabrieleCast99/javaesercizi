import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class loadlines {
    public List<String> loadlines(String filePath) throws IOException {
        List<String> lines= new ArrayList<>();
        BufferedReader reader= new BufferedReader(new FileReader(filePath));
        String line= reader.readLine();
        while(line!=null){
            lines.add(line);
            line= reader.readLine();
        }
        reader.close();
        return lines;

    }
}
