package org.cydeo.doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {

        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s3 = Calculator::findSum;
        s3.calculate(10,20);

        Calculate s2 = (x,y) -> Calculator.findMultiply(x,y);
        s2.calculate(10,20);

        Calculate s4 = Calculator::findMultiply;
        s4.calculate(10,20);

        BiFunction<String, Integer, String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("developer",6));

        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("developer",6));

        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(10);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(10);

        BiFunction<MyClass, Integer, Double> v2 = MyClass::method;

        BiFunction<String, String, String> v3 = String::concat;
    }

}
