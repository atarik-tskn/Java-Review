package org.cydeo.functionalInterfaces;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class User {
    private String firstName;
    private String lastName;
    private int age;
}