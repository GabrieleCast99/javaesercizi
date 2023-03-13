import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GestoreFile {
    String fileIn="D:\\javaesercizi\\esercizi_stream\\src\\file1";
    String fileOut="D:\\javaesercizi\\esercizi_stream\\src\\file2";

    public static void inizialiParole (String fileIn, String fileOut) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileIn));


            HashMap<Character, HashSet<String>> parole =new HashMap<>();

            String linea;

            while((linea=reader.readLine())!=null){
                String[] paroleIn=linea.split(" ");
                for(String parola:paroleIn){
                    char iniziale=parola.charAt(0);
                    if (!parole.containsKey(iniziale)) {
                        parole.put(iniziale, new HashSet<String>());
                    }
                    parole.get(iniziale).add(parola);

                    reader.close();
                }
            }


            BufferedWriter writer=new BufferedWriter(new FileWriter(fileOut));
            for (Map.Entry<Character, HashSet<String>> entry : parole.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");

            }











        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
