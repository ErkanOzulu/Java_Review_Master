package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {


       List<User>users=new ArrayList<>();
       users.add(User.builder().firstName("Mike").LastName("Smith").age(35).build());
       users.add(User.builder().firstName("Tom").LastName("Hans").age(35).build());
       users.add(User.builder().firstName("Ammy").LastName("Evan").age(35).build());
       users.add(User.builder().firstName("Emma").LastName("Pellard").age(35).build());

       //Print all elements in the list
        printName(users,p->true);

        System.out.println("-------------");
        //Print all users that last name starts with E

        printName(users,user->user.getLastName().startsWith("E"));

    }

    private static void printName(List<User>users, Predicate<User>p){


        for (User user : users) {
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
