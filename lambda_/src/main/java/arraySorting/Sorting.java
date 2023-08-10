package arraySorting;
//it should be only have one abstract method to implement lambda.(Functional interface)
@FunctionalInterface
public interface Sorting {
    public void sort();
}


/**
    to apply behavioral parametrization, the rule has three steps
 1- prepare an interface --> allows creating a method with doesn't have any implementation
 2- Create a class that implement to that interface and give implementation
 3- Create an object from the implementation class and give as a behavior
 */