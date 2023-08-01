package Practice;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str="ABCABCABC";

        // Write your codes here:

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.contains(""+ch)){
                continue;
            }else {

                result+=ch;
            }

            }
        System.out.println("result = " + result);



    }
}


/*

Ex:
    Str="ABCABCABC"

        output:
                ABC
 */