package Tasks.States;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        // Suppose we have a State class that contains list of cities. Create a list of States and print all the cities.


        State va=new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx=new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");


        List<State>stateList= Arrays.asList(va,tx);

        stateList.stream().map(state -> state.getCity())
                        .forEach(System.out::println);

        System.out.println("****************");

        stateList.stream()
                .flatMap(state -> state.getCity().stream())
                .forEach(System.out::println);


        System.out.println("****************");

        stateList.stream().map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);






    }
}
