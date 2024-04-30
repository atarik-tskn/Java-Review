package org.cydeo.Task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, color.GREEN));
        inventory.add( Orange.builder().weight(200).color(color.GREEN).build());
        inventory.add( Orange.builder().weight(150).color(color.RED).build());
        inventory.add( Orange.builder().weight(100).color(color.GREEN).build());
        inventory.add( Orange.builder().weight(400).color(color.RED).build());
        inventory.add( Orange.builder().weight(250).color(color.GREEN).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of " +orange.getWeight() + "g";

        prettyPrintApple(inventory, simpleFormatter);

        System.out.println("-------------------------------------");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor()+ " orange:";
        };
        prettyPrintApple(inventory, fancyFormatter);
    }
    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter) {
        for (Orange orange: inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
//Lambda expression par 2 41:02