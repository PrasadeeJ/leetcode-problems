import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> target = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
                System.out.println();
        }
        int[] output = target.stream().mapToInt(i -> i).toArray();
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ints = createTargetArray(nums, index);
        System.out.println(
                Arrays.stream(ints)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(", ", "[", "]")));
    }
}
