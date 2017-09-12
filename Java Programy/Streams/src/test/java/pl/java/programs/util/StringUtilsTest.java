package pl.java.programs.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-09-12.
 */
public class StringUtilsTest {
    @Test
    public void returnMap() {

        List<String> test = StringUtils.getLetters("Laptop")
                .collect(Collectors.toList());

        System.out.println(test);



    }
    @Test
    public void getLetters() throws Exception{
        List<String > list = Arrays.asList("Przemek", "Jan", "Wojtek");
        Stream<Stream<String>> streamStream = list.stream().map(StringUtils::getLetters);
        Stream<String> stringStream = list.stream().flatMap(StringUtils::getLetters);
        List<String> collect = stringStream.collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

}