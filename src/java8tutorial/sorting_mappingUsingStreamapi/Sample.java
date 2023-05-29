package java8tutorial.sorting_mappingUsingStreamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<String> alpha = new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        System.out.println(alpha); //A B C D
        //a b c d
        //To convert List of string into  upper case Before java
List<String> upper = new ArrayList<>();
        for (String s:alpha
             ) {
           upper.add(s.toUpperCase());
        }

        System.out.println(upper); //A B C D

        //To convert List of string into  upper case After java8
        List<String> collect =  alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        //Extra Streams apply to any datatype
        List<Integer> nums = Arrays.asList(1,2,3,5,6);
        List<Integer> collect1 = nums.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 10, 12]

        List<Integer> collect2 = nums.stream().map(n -> n-2).collect(Collectors.toList());
        System.out.println(collect2); //[-1, 0, 1, 3, 4]

        //In this use case i am going to map User Object into UserDTO object using stream.map()
    }
}
