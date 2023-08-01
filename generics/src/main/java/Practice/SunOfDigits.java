package Practice;

public class SunOfDigits {
    public static void main(String[] args) {

        String str="A1B2C3D4";
        // Write your codes here:

        int sum=0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                sum+=Integer.parseInt("" + ch);  //concat for change to string because this class using for strings
            }
        }
        System.out.println("sum of digits in a string= " + sum);

    }
}
/*
Write a program that can calculate the sum of all the digits present in a given string

ex:

        str:"A1B2C3D4"

        output:10
 */