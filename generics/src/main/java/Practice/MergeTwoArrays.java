package Practice;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[]arr1={10,20,30};
        int[]arr2={15,25,30,5,0};
        
        //Write your codes here:
        
        int[] arr3=new int[arr1.length+arr2.length];
        
        int i=0;
        for (int each : arr1) {
            arr3[i++]=each;
        }

        for (int each : arr2) {
            arr3[i++]=each;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
