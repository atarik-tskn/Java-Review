package org.tarik;
import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("----------------");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print Three high caloric dish name(>300)
        System.out.println("-----------------");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //Print all dish name that are below 400 calories in sorted
        System.out.println("-----------------");
        DishData.getAll().stream()
                .filter(dish->dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("-----------------");
        long total = DishData.getAll().stream()
                .count();
        System.out.println(total);

        System.out.println("-----------------");
        int total2 =DishData.getAll().stream()
                .map(d -> 1).reduce(0,(a,b)->a+b);
        System.out.println(total2);



    }
}
