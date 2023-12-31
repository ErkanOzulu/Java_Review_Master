import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Celine");
        map.put(2,"Allen");
        System.out.println(map.get(2));
        System.out.println(findFirstNonRepeating("deo avac deveoe"));
    }

    public static Character findFirstNonRepeating(String str){
        Map<Character,Integer>map=new HashMap<>();
        //for counting the chars

        int count;

        for (Character ch : str.toCharArray()) {

            if (map.containsKey(ch)){
                count=map.get(ch);
                map.put(ch,count+1);
            }else map.put(ch,1);

        }

        // starting from string, check if the char count equals 1
        for (Character ch:str.toCharArray()){
            if (map.get(ch)==1) return ch;
        }
        return Character.MIN_VALUE; //return null;
    }
}
