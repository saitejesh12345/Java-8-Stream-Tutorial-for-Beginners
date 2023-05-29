package java8tutorial.FilterusingStreamAPi;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        //create a stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //create stream for sources like Collections,Set,StringArray,List
        Collection<String> collection = Arrays.asList("sai","teja","aakash","sai");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        Set<String> set = new HashSet<>();
        Stream<String> stream2= collection.stream();
        stream2.forEach(System.out::println);

        List<String> list = Arrays.asList("Rama","sita","lakshman");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        String[] strArray = {"sai","teja","saiteja"};
        Stream<String> stream4 = Arrays.stream(strArray);
        stream4.forEach(System.out::println);

    }
}
