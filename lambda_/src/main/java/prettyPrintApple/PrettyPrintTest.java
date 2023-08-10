package prettyPrintApple;

import applePredicate.Apple;
import applePredicate.AppleTest;
import applePredicate.Color;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintTest {
    public static void main(String[] args) {

        List<Apple>inventory=new ArrayList<>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));



        prettyPrintApple(inventory, new AppleFancyFormatter());

        System.out.println("---------------");

        prettyPrintApple(inventory,new AppleSimpleFormatter());

    }


    public static void prettyPrintApple(List<Apple>inventory,AppleFormatter formatter){


        for (Apple apple : inventory) {
            String output=formatter.accept(apple);
            System.out.println(output);
        }

    }

}
