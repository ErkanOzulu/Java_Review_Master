package Tasks.Trader;

import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class TransactionTest {

    public static void main(String[] args) {

        //1. Find all transactions in the year 2011 and sort them by value(small to high)


        System.out.println("*****Task1*******");

        TransactionData.getAll().stream()
                .filter(t -> t.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2- What are all the unique cities where the traders work?
        System.out.println("******Task-2************");
        TransactionData.getAll().stream()
                .map(t->t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println("******Task-3************");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4- Return a string of all trader's names sorted alphabetically
        System.out.println("******Task-4************");
        String result = TransactionData.getAll().stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2+" ");
        System.out.println(result);


        //5- Are any traders based in Milan?
        System.out.println("******Task-5************");

        boolean milanBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        //6- Print the values of all transactions from the traders living in Cambridge
        System.out.println("******Task-6************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7 - What is the highest value of all the transactions
        System.out.println("******Task-7************");

        Optional<Integer> high = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        System.out.println(high.get());

        System.out.println("---------second way------");

        TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .sorted(reverseOrder())
                        .limit(1).forEach(System.out::println);


        //8-What is the smallest value of all the transactions

        System.out.println("******Task-8************");

        Optional<Integer> smallest = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(smallest.get());

        System.out.println("---------second way------");

        TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        //9-Find the transaction with the smallest value
        System.out.println("******Task-9************");

        Optional<Transaction> smValue = TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(smValue.get());

        System.out.println("----second way----");

        Optional<Transaction> smValue2 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smValue2.get());

        System.out.println("----third way----");

        TransactionData.getAll().stream()
                .sorted(comparing(Transaction::getValue))
                .limit(1)
                .forEach(System.out::println);


    }

}
