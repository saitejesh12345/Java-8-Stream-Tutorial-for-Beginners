package SortingList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingComparator {

    public static void main(String[] args) {
//        List<String> obj = new ArrayList<String>();
//        obj.add("Banana");
//        obj.add("Apple");
//        obj.add("Mango");
//        obj.add("Watermelon");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Ragav",30,40000f));
        employees.add(new Employee(20,"Aakash",28,38000f));
        employees.add(new Employee(30,"Thanmayi",21,20000f));
        employees.add(new Employee(34,"Shalini",40,80000f));

        //sort based on salary,Sorting List of Employe Objects in Ascending  order using Stream api
        List<Employee> employeessortedlist1 = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeessortedlist1 );

        //sort based on salary,Sorting List of Employe Objects in Descending  order using Stream api
        List<Employee> employeessortedlist3 = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeessortedlist3 );

        //sort based on salary,Sorting List of Employe Objects in Descending  order using Comparator
        List<Employee> employeessortedlist4 =  employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(employeessortedlist4);

        //sort based on age,Sorting List of Employe Objects in Ascending  order using  using Comparator
        List<Employee> employeessortedOnAge =employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println(employeessortedOnAge);

        //sort based on age,Sorting List of Employe Objects in Descending  order using  using Comparator
        List<Employee> employeessortedOnAge2 =employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println(employeessortedOnAge2);

        //sort based on name,Sorting List of Employe Objects in Ascending  order using Comparator
        List<Employee> employeessortedOnName = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(employeessortedOnName);

        //sort based on name,Sorting List of Employe Objects in Descending  order using Comparator
        List<Employee> employeessortedOnName2 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        System.out.println(employeessortedOnName2);
    }
}
