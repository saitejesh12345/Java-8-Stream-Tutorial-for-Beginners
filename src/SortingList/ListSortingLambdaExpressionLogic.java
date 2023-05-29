package SortingList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortingLambdaExpressionLogic {

    public static void main(String[] args) {
        List<String> obj = new ArrayList<String>();
        obj.add("Banana");
        obj.add("Apple");
        obj.add("Mango");
        obj.add("Watermelon");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh",30,40000f));
        employees.add(new Employee(20,"Suresh",28,38000f));
        employees.add(new Employee(30,"Mahesh",21,20000f));
        employees.add(new Employee(34,"kamesh",40,80000f));

        //Sorting List of string Objects in Ascending order using Lambda expression logic
        List<String> sortedlist1=  obj.stream().sorted(((o1, o2) -> o1.compareTo(o2))).collect(Collectors.toList());
        System.out.println(sortedlist1);

        //Sorting List of string Objects in Descending order using Lambda expression logic
        List<String> sortedlist6=  obj.stream().sorted(((o1, o2) -> o2.compareTo(o1))).collect(Collectors.toList());
        System.out.println(sortedlist6);

        //Sorting List of Employe Objects in Ascending  order using Lambda expression
        List<Employee> employeessortedlist2 =  employees.stream()
                .sorted((Employee o1, Employee o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeessortedlist2);

    }
}
