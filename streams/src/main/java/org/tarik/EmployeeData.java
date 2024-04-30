package org.tarik;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("234234234234", "6234523462345")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("1234534234234", "124434523462345")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("51341234234234", "21412523462345")
        ));
    }
}
