import java.util.HashMap;
import java.util.List;

public class processLines {
    public HashMap<String, Integer> processLines(List<String> lines){
        HashMap <String,Integer> map= new HashMap<>();
        for(String line:lines){
            if(line.isEmpty()){
                continue;

                int ch=line.indexOf("$");
                 if(ch==0){
                     System.out.println("Error");
            }
                 String key=line.substring(0,ch);
                 String valore=line.substring(ch+0);
                 int value=valore.split("\\s").length;
                 map.put(key,value);



            }
        }
        return map;
    }
}
