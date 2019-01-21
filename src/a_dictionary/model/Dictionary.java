package a_dictionary.model;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> map;

    public Dictionary() {
        this.map = new HashMap<>();
    }

    public void loadFromFile(String fileName) {
        int size = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(";");
                map.put(words[0], words[1]);
                size++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(size + " words loaded");
    }

    public void addWord(String eng, String ukr) {
        map.put(eng, ukr);
    }

    public String translate(String eng) {
        return map.get(eng);
    }


}
