package org.cydeo.doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero-argument
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One Argument
        Function<Integer, Car> c3 = model -> new Car(model);
        Car bmw = c3.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer,Car> c4 = Car::new;
        Car mercedes = c4.apply(2012);
        System.out.println(mercedes.getModel());

        //Two argument
        BiFunction<String,Integer,Car> c5 = (make,model) -> new Car(make,model);
        Car honda = c5.apply("Honda",2007);
        System.out.println(honda.getMake() + " " + honda.getModel());

        BiFunction<String, Integer, Car> c6 = Car::new;
        Car honda2 = c6.apply("Honda",2002);
        System.out.println(honda2.getModel() + " " + honda2.getMake());

    }
}
