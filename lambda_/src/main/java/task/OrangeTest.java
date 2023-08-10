package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange>inventory=new ArrayList<>();

        inventory.add(new Orange(300,Color.GREEN));
        //thanks to builder, you can skip any field, it fills empty field with default value
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter=(orange)-> "An orange of "+ orange.getWeight()+" g";

        prettyPrintApple(inventory,simpleFormatter);

//        prettyPrintApple(inventory,orange-> "An orange of "+ orange.getWeight()+" g"); -->you can also write in the method

        System.out.println("**********************");

        //if you have more than one line code you need to put { }
        OrangeFormatter fancyFormatter=(orange) ->{
            String characteristic=orange.getWeight()>150?"Heavy":"Light";
            return "A "+characteristic+" "+orange.getColor()+" orange";
        };


        prettyPrintApple(inventory,fancyFormatter);




    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter) {

        for (Orange orange : inventory) {

            String output= orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }


}
