package org.cydeo;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();

        QuickSort qs = new QuickSort();
        BubbleSorting bs = new BubbleSorting();
        as.sort(qs);
        as.sort(bs);

        //Sorting myLambda = () -> System.out.println("Sorting the array");

        //Sorting myLambda2 = () -> System.out.println("Sorting the array");

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () ->System.out.println("Quick sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () ->System.out.println("Bubble sorting");
        as.sort(bubbleSort);



    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }





}
