package SortingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sorting List of string Objects in Ascending order using Stream API
public class StreamListSortingOrder {
    public static void main(String[] args) {
         List<String> obj = new ArrayList<String>();
         obj.add("Banana");
         obj.add("Apple");
         obj.add("Mango");
         obj.add("Watermelon");
       List<String> sortedlist=  obj.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
         System.out.println(sortedlist);



        //sorted method which don't have any Comparator
        List<String> sortedlist3=  obj.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist3);


        //Sorting List of string Objects in Descending order using Stream API
        List<String> sortedlist4=  obj.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedlist4);


        System.out.println("..............................................................................................");

    }
}
