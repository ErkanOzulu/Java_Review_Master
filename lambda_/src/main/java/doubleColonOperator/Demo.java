package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {


        //METHOD REFERENCE


        // referencing to a static method using Anonymous class
        Calculate cal1 = new Calculate() {
            @Override
            public void calculate(int x, int y) {
                Calculator.findSum(x, y);
            }
        };
        cal1.calculate(10, 20);

        // referencing to a static method using lambda
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(10, 20);

        // referencing to a static method using lambda and double colon
        Calculate s2 = Calculator::findSum;
        s2.calculate(100, 35);


        //Reference to instance method
        Calculate m1 = (x, y) -> new Calculator().findMultiply(x, y);
        m1.calculate(5, 6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(8, 9);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(6, 6);


        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);

        System.out.println(fn.apply("Developer", 6));

        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 6));


        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);

        BiFunction<MyClass, Integer, Double> v2 = MyClass::method;

        BiFunction<String, String, String> v3 = String::concat;


    }
}
