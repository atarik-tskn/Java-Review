package org.tarik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int result =numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);


        //No initial value
        Optional<Integer> result2 = numbers.stream().reduce((a, b)->a+b);
        System.out.println(result2);

        //Max and Min

        Optional<Integer> result3 = numbers.stream().reduce(Integer::max);
        System.out.println(result3);

        Optional<Integer> result4 = numbers.stream().reduce(Integer::min);
        System.out.println(result4);

        Optional<Integer> result5 = numbers.stream().reduce(Integer::sum);
        System.out.println(result5);

    }

}
