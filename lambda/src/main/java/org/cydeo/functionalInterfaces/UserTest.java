package org.cydeo.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Doe").age(35).build());
        users.add(User.builder().firstName("Jane").lastName("Evan").age(33).build());
        users.add(User.builder().firstName("Neil").lastName("Doe").age(36).build());
        users.add(User.builder().firstName("Thomas").lastName("Ether").age(37).build());

        //Print all elements in the list

    printName(users, p -> true);

        //Print all users that last name starts with E
    printName(users, p -> p.getLastName().startsWith("E"));

    }

    private static void printName(List<User> users, Predicate<User> p) {
        for(User user: users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }

}
