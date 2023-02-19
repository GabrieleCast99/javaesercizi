import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        try {
            String newFilePath = "D:\\javaesercizi\\es_java-avanzato\\es_62--Streams_2--\\src/file.txt";
            File newFile = new File(newFilePath);
            if (newFile.createNewFile()) System.out.println("File created");
            else System.out.println("File already exists, overwriting it");
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath));
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            writer.write(dateTime.format(formatter));
            writer.close();
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}