import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    int[] myArray={2,7,9,11};
    int target=9;

        System.out.println(Arrays.toString(twoSum1(myArray, target)));

        System.out.print("Optimal solution O(n)= ");

        System.out.println(Arrays.toString(twoSum2(myArray, target)));


    }
    // Bruteforce Solution of Two Sum problem.
    public static int[] twoSum1(int[] myArray, int target) { //n*n -->>O(n^2)

        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 1; j < myArray.length; j++) {
                if (i!=j) {
                    if ((myArray[i] + myArray[j]) == target) return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
//my Optimal Solution O(n)
    public static int[] twoSum2(int[]array, int target){

        //Create HashMap

        Map<Integer,Integer>map=new HashMap<>();
        //Iterate over the array.
        // If a potential match exists return that indices else put the array value and index to map

        for (int i = 0; i < array.length; i++) {
            int potentialMatch=target-array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i],i);

        }

return null;  // return new int[]{};
    }
}


//how can ı get result only one shut.If one paa is possible?