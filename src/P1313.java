import java.util.Arrays;
import java.util.stream.Collectors;

public class P1313 {

    public static int[] decompressRLElist(int[] nums) {
        int len2 = 0;
        for(int i= 0; i< nums.length; i+=2){
            len2 += nums[i];
        }

        int[] arr2 = new int[len2];
        int start = 0;
        for(int i=1; i< nums.length; i+=2){
            int freq = nums[i-1];
            int val = nums[i];

            Arrays.fill(arr2,start, start+freq, val);
            start+=freq;
            }
            return arr2;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ints = decompressRLElist(nums);
        System.out.println(
                Arrays.stream(ints)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(", ", "[", "]")));
    }
}
