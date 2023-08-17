import Tasks.DishData;

public class CountDish {
    public static void main(String[] args) {



        int dishCount = DishData.getAll().stream()
                .map(d -> 1).reduce(0, (a, b) -> a + b);

        System.out.println("dishCount = " + dishCount);


        long dishCount2 = DishData.getAll().stream().count();

        System.out.println("dishCount2 = " + dishCount2);

    }
}
