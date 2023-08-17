import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 7, 8);

        //empty() -isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent());

        //ifPresent
        Optional<Integer> bigNumber = numbers.stream().filter(x -> x > 100).findAny();

        bigNumber.ifPresent(System.out::println);

        //get
//        System.out.println(bigNumber.get());

        //orElse
        System.out.println(bigNumber.orElse(0));


    }
}
