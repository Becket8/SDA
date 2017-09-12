package pl.java.programs.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by RENT on 2017-09-12.
 */
public class StringUtils {


    public static Stream<String> getLetters(String word){
        List<String> result = new ArrayList<>();
        for(int i =0; i < word.length();i++){
            result.add(String.valueOf(word.charAt(i)));



        }
        return result.stream();
    }
}
