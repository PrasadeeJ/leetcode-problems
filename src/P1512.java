import java.util.*;

public class P1512 {

    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        for(int i: nums){
            if(ht1.containsKey(i)){
                count += ht1.get(i);
                ht1.put(i, ht1.get(i) + 1);
            }else{
                ht1.put(i,1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }
}
