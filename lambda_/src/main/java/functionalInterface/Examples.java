package functionalInterface;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //*******PREDıCATE*******//

//        Predicate<Integer>lesserThan=new Predicate<Integer>() {  //anonymous class
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        lesserThan.test(50);


        Predicate<Integer>lesserThan= (a) -> a<18; //Implementation of test that belongs to Predicate interface
        boolean result = lesserThan.test(50);
        System.out.println(result);


        //*******CONSUMER*******//
        Consumer<Integer>display=i-> System.out.println(i);
        display.accept(50);

        //*******BICONSUMER*******//

        BiConsumer<Integer,Integer> addTwo=(x,y)-> System.out.println(x+y);

        addTwo.accept(100,200);


        //*******FUNCTION*******//
        Function<String,String>fun=s->"Hello "+s;

        String str = fun.apply("Ozzy");
        System.out.println(str);

        System.out.println(fun.apply("Ozzy"));

        //*******SUPPLIER*******//
        Supplier<Double>randomValue=()->Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> pred=(p)->p%2==0? true:false;

        System.out.println(pred.test(10));


        BiConsumer <Integer,String>bn =(x,y)-> System.out.println(x+y);
        bn.accept(5,"apple");


    }
}

//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html