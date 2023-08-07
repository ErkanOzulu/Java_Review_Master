package Practice;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {


        int[] arr={10,5,30,15,0, 100, 200,300};

        // Write your codes here:

        int[] newArr=new int[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            newArr[j]=arr[i];
        }
        System.out.println(Arrays.toString(newArr
        ));

    }

}
