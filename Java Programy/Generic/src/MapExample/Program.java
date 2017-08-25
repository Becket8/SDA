package MapExample;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Program {
    public static final String PATH_TO_FILE = "./src/MapExample/slowa.txt";


    public static List<String> getText() {

        List<String> result = null;


        try {
            result = Files.readAllLines(Paths.get(PATH_TO_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static Path addFile() {
        Path result = null;
        if (PATH_TO_FILE == null)
            try {
                result = Files.createFile(Paths.get(PATH_TO_FILE));
            } catch (IOException e) {
                e.printStackTrace();
            }
        return result;
    }

    public static List<String> getWords(List<String> Text) {
        List<String> lines = Text;
        List<String> oneWord = new ArrayList<>();
        for (String line : lines) {
            String[] word = line
                    .replace(",", "")
                    .replace(".", "")
                    .split(" ");

            oneWord.addAll(Arrays.asList(word));

        }

        return oneWord;
    }

    public static Map<String, Integer> Map(List<String> Text) {
        Map<String, Integer> mapOfWords = new HashMap<>();
        List<String> allWords = getWords(Text);
        for (String word : allWords) {
            if (mapOfWords.containsKey(word)) {
                Integer value = mapOfWords.get(word);
                value++;
                mapOfWords.put(word, value);
            } else {
                mapOfWords.put(word, 1);
            }


        }
        return mapOfWords;
    }

    

}
