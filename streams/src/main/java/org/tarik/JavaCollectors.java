package org.tarik;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        //toCollection(Supplier) : is used to create a collection using collector
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //TO COLLECTION

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        System.out.println("----------------------------");
        Set<Integer> numberSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("-----------------------------");
        List<Integer> numList= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(numList);

        //toSet(): returns a Collector interface that gathers the input data into a new set
        System.out.println("-----------------------------");
        Set<Integer> numSet2= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numSet2);

        //toMap(Function,Function): returns a Collector interface that gathers the input data into a new map
        System.out.println("----------------------------");
        Map<String, Integer> disMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(disMap);

        System.out.println("----------------------------");
        //counting() : returns a Collector that counts the number of the elements
        long count = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(count);

        System.out.println("----------------------------");
        //summingInt(ToIntFunction) : returns a Collector that produces the sum of an integer-value function
        Integer sum3 = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum3);

        System.out.println("----------------------------");
        //averagingInt(toIntFunction): returns the average of the integers passed values
        Double average = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(average);

        System.out.println("----------------------------");
        //joining(): is used to join various elements of a character of string array into a single string object
        List<String> courses = Arrays.asList("Java", "JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);


        System.out.println("----------------------------");
        //partitioningBy(): is used to partition a stream of objects(or set of elements) based on a given predicate
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("----------------------------");
        //groupingBy() : is used for grouping objects by some property and storing results in a map instance
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}
