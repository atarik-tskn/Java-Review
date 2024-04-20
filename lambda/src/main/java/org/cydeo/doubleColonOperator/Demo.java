package org.cydeo.doubleColonOperator;

public class Demo {

    public static void main(String[] args) {

        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        s1.calculate(10,20);

        Calculate s2 = (x,y) -> Calculator.findMultiply(x,y);

        s2.calculate(10,20);

        Calculate s3 = Calculator::findSum;
        s3.calculate(10,20);

        Calculate s4 = Calculator::findMultiply;
        s4.calculate(10,20);

    }

}
