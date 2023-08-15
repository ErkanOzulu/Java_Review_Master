package Tasks.EmployeeTsk;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


        //print all emails --> One employee has one email - One to Oone
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        //Print all phone numbers
        System.out.println("*********************");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);


        System.out.println("*********************");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("*********************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
