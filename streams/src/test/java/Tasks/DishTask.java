package Tasks;

import java.util.Arrays;
import java.util.List;

public class DishTask {
    public static void main(String[] args) {

                List<Dish>menu= Arrays.asList(

                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );

        /**
         Print all dish’s name that has less than 400 calories.
         */

        menu.stream()
                .filter(i->i.getCalories()<400)
                .forEach(i-> System.out.println(i.getName()));

        System.out.println("---second way---");
        menu.stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);



        /**
         Print the length of the name of each dish
         */


        menu.stream()
                .map(i->i.getName().length())
                .forEach(System.out::println);

        System.out.println("---second way---");

        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
    }
}
