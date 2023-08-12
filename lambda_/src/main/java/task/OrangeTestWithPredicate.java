package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTestWithPredicate {

    public static void main(String[] args) {

        List<Orange> store = new ArrayList<>();
        store.add(new Orange(300, Color.RED));
        store.add(Orange.builder().weight(200).color(Color.GREEN).build());
        store.add(Orange.builder().weight(100).color(Color.GREEN).build());
        store.add(Orange.builder().weight(500).color(Color.RED).build());
        store.add(Orange.builder().weight(250).color(Color.RED).build());


    }


}

