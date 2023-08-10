package applePredicate;

public interface ApplePredicate {

    boolean test(Apple apple);
}


//it should be only have one abstract method to implement lambda.(Functional interface)
// if you have more than one abstract method you cannot implement  lambda express. and you need to do behavioral parameterization