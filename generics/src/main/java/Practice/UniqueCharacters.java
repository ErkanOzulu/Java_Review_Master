package Practice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str="aabccdee!@";
        // write your codes here:
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                unique+=ch;
            }
        }

        System.out.println("unique = " + unique);


    }
}

/*
write a program that can identify and return only the unique characters presented in a given string.The solution should handle alphanumeric characters, whitespace, and special characters.It should also handle different string lengths effectively, and preserve the order of unique characters.
Ex:
    str= "aabccdee"

     output:
            bd
 */