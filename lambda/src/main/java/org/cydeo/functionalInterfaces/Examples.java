package org.cydeo.functionalInterfaces;

import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {
        //Predicate Example
     //   Predicate<Integer>  lesserThan =  new Predicate<Integer>() {
     //       public boolean test(Integer integer) {
     //           return integer<18;
      //      }
      //  };

        Predicate<Integer> lessThan = a-> a<18; //Implementation of test method that belongs to Predicate interface
        Boolean result = lessThan.test(50);
        System.out.println(result);



    }

}
