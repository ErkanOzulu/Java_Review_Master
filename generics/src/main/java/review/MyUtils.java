package review;

import java.util.ArrayList;
import java.util.List;

public class MyUtils<T extends Person> {


    public static<T> void printInfo3(List<T> personList){   //if method static and class not static we have to use "static<T> "

        for (T person : personList) {

            System.out.println(person);

        }

        System.out.println(personList.size());

    }

    // write a method that will take list of objects and returns the last element in the list


    public T returnLastElement(List<T> personList){    //we don't need to use <T> because of class has <T>

        return personList.get(personList.size()-1);

    }

    // write a method that takes a list of objects and prints everyone's names one by one

    public void  printNames(List<T>personList){
        for (T person : personList) {
            System.out.println(person.getName());
        }

    }




    public static void main(String[] args) {
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Max", 103));

        List<Teacher>teacherList=new ArrayList<>();

        teacherList.add(new Teacher("Eric", 201));
        teacherList.add(new Teacher("David", 202));

        MyUtils.printInfo3(teacherList);
        printInfo3(studentList);

        MyUtils<Student>myUtils=new MyUtils<>();
        myUtils.returnLastElement(studentList);

        myUtils.printNames(studentList);





       // MyUtils<String>sdf=new MyUtils<String>();// it doesn't accept <String> because the class generics type extends the person class. It means it only can use the method of the extended class


    }

}
