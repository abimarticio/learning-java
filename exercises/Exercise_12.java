import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

class Exercise_12 {

    static ArrayList<String> getDataList(File file) throws FileNotFoundException {
        Scanner fileReader = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while(fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            list.add(data);
        }
        fileReader.close();
        return list;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("exercises/spell-errors.txt");
        Scanner fileReader = new Scanner(file);
      
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            String[] line = a.split(":");
            map.put(line[1], line[0]);
        }
        Map<String, String> newMap = new HashMap<String, String>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey().strip();
            if(key.contains(",")){
                String[] arrKey = key.split(",");
                for(int i = 0; i < arrKey.length; i++){
                    key = arrKey[i].strip();
                    newMap.put(key, value);
                }
            }
            else{
                newMap.put(key, value);
            }
        }
        String[] texts = {"rainning", "raning", "writtings", "forer"};
        for(int i = 0; i < texts.length; i++) {
            System.out.println(texts[i] + " => " + newMap.get(texts[i]));
        }
    }  
}