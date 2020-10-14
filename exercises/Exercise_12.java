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
    static Map<String, String> createDictionary(ArrayList<String> list) {
        Map<String, String> dictionary = new HashMap<String, String>();
        for (int i = 0; i < list.size(); i++) {
            String words = list.get(i);
            String[] line = words.split(":");
            dictionary.put(line[1], line[0]);
        }
        return dictionary;
    }
    static Map<String, String> newDictionary(Map<String, String> dictionary) {
        Map<String, String> corrections = new HashMap<String, String>();
        for (Map.Entry<String,String> entry : dictionary.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey().strip();
            if(key.contains(",")){
                String[] arrKey = key.split(",");
                for(int i = 0; i < arrKey.length; i++){
                    key = arrKey[i].strip();
                    corrections.put(key, value);
                }
            }
            else{
                corrections.put(key, value);
            }
        }
        return corrections;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("exercises/spell-errors.txt");
        String[] texts = {"rainning", "raning", "writtings", "forer"};
        for(int i = 0; i < texts.length; i++) {
            System.out.println(texts[i] + " => " + newMap.get(texts[i]));
        }
    }  
}