package prettyPrintApple;

import applePredicate.Apple;
import applePredicate.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrettyPrintWithCunsomer {

    public static void main(String[] args) {

        List<Apple>inventory=new ArrayList<>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        prettyPrintApple(inventory,apple-> System.out.println("A "+(apple.getWeight()>150?"Heavy":"Light")+" "+apple.getColor()+" apple"));
        prettyPrintApple(inventory,apple -> System.out.println("An apple of "+ apple.getWeight()+" g"));



    }

    public static void prettyPrintApple(List<Apple>inventory, Consumer<Apple> format){

        for (Apple apple : inventory) {
            format.accept(apple);

        }


    }

}
