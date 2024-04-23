package org.tarik;

import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State va = new State();
        va.addCity("McLean");
        va.addCity("Fairfax");
        va.addCity("Arlington");
        va.addCity("FallsChurch");

        State tx = new State();
        tx.addCity("Austin");
        tx.addCity("Houston");
        tx.addCity("Plano");
        tx.addCity("Dallas");

        List<State> list = Arrays.asList(va,tx);

        //list.stream().map(state -> state.getCity()).forEach(System.out::println);
        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
