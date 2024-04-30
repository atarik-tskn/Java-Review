package org.tarik;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {

        //Find all transactions in 2011 and sort by value
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println("---------------------------");

        //What are all the unique cities where the traders work
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println("----------------------------");

        //Find all traders from Cambridge and sort them by name
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName))
                .distinct()
                .forEach(System.out::println);

        //Return a string of all trader's names sorted alphabetically
        System.out.println("----------------------");
        String name = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2)->name1+name2+" ");

        System.out.println(name);


        //Are any traders based in Milan?
        System.out.println("-----------------------");
        boolean milanBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);


        // Print the values off all transactions from the traders living in Cambridge
        System.out.println("------------------------");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //What is the highest value of all transactions
        Optional<Integer> max = TransactionData.getAll().stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max);
        System.out.println(max);

        //What is the minimum value of all transactions
        Optional<Transaction> smvalue = TransactionData.getAll().stream()
                .reduce((t1,t2) -> t1.getValue()<t2.getValue() ? t1 : t2);
        System.out.println(smvalue);

    }

}
