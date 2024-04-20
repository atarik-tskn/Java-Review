package org.cydeo.comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //Ascending Sort
        Collections.sort(list);
        System.out.println(list);

        //Descending sort
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //Ascending
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending
        list.sort((o1,o2) -> o2.compareTo(o1));
        System.out.println(list);

        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(70,Color.RED),
                new Apple(50,Color.GREEN)
        );

        Comparator<Apple> sortApple = Comparator.comparing(apple -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

    }
}
