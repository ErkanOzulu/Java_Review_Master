public class Reverse {
    public static void main(String[] args) {


        String str="Bryan Adams";


        String reversedStr="";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr+=str.charAt(i);

        }

        System.out.println("reversedStr = " + reversedStr);

        if (str.equalsIgnoreCase(reversedStr)){
            System.out.println("Palindrome");
        }

        System.out.println("===========second way==============");

         //StringBuffer is thread-safe and synchronize but slow

        StringBuffer str1=new StringBuffer(str);
        System.out.println("str1.reverse() = " + str1.reverse());

        System.out.println("===========third way==============");

        //StringBuffer is not thread-safe and synchronize but fast

        StringBuilder str2=new StringBuilder(str);

        System.out.println("str2.reverse() = " + str2.reverse());


    }
}
