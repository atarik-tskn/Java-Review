package org.cydeo.functionalInterfaces;

import java.sql.SQLOutput;
import java.util.function.*;

public class Examples {

    public static void main(String[] args) {
        //Predicate Example
        //   Predicate<Integer>  lesserThan =  new Predicate<Integer>() {
        //       public boolean test(Integer integer) {
        //           return integer<18;
        //      }
        //  };
        Predicate<Integer> lessThan = a -> a < 18; //Implementation of test method that belongs to Predicate interface
        Boolean result = lessThan.test(50);
        System.out.println(result);
        //CONSUMER EXAMPLE
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);
        //BICONSUMER
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(10, 20);
        //FUNCTION
        Function<String, String> fun = s -> "Hello " + s;
        String str = fun.apply("World");
        System.out.println(str);
        //SUPPLIER
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());





        Predicate<Integer> pred = (p) -> p%2 ==0 ? true: false;
        System.out.println(pred.test(50));


        BiConsumer<Integer, String> sum = (x,y) -> System.out.println(x+y);
        sum.accept(10, "apple");

    }
}