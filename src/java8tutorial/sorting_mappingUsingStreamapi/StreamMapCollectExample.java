package java8tutorial.sorting_mappingUsingStreamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {


        //In this use case i am going to map User Object into UserDTO object using stream.map()

        List<User> obj = new ArrayList<>();
        obj.add(new User(1, "Ramesh", "Secret", "Ramesh@gmail.com"));
        obj.add(new User(1, "Aakash", "Secret", "Aakash@gmail.com"));
        obj.add(new User(1, "Saitejesh", "Secret", "Saitejesh@gmail.com"));


        //Traditional method we store User Objects into UserDTO in list lets create List of USERDTO

        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        for (User user : obj
        ) {
            userDTOS.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }

        for (UserDTO i : userDTOS) {
            System.out.println(i);
        }
        System.out.println("\t");
        System.out.println("...............ANOTHER IMPLEMEMTATION streams JAVA 8 USING LAMBDA..............");
        System.out.println("\t");

        //using stream.map() method
        List<UserDTO> userDTOSS= obj.stream().map((User user) ->
                new  UserDTO(user.getId(), user.getUserName(), user.getEmail())).collect(Collectors.toList());
         userDTOSS.forEach(System.out::println);
        //                forEach(userDTO -> {
//                    System.out.println(userDTO);
//                });

    }
}
