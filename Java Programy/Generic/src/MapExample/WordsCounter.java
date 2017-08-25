package MapExample;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordsCounter {
    public static void main(String[] args) {

        Program.addFile();
        List<String> Text = Program.getText();
        List<String> soloWordText = Program.getWords(Text);
        System.out.println(soloWordText);

        Map<String,Integer> Type = Program.Map(Text);
        for(String key : Type.keySet()){
            System.out.println("Słowo "+ key + " wystąpiło " + Type.get(key)+ " razy");
        }


    }


}
