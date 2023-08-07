package Practice;

public class MaxMinNumbers {

    public static void main(String[] args) {

        int[] arr={10,5,-4,20,15};
        //Write your codes here:

        int max=arr[0];
        int min=arr[0];

        for (int each : arr) {
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }

        System.out.println("Maximum number is " + max + " and minimum number is " + min);

    }
}
