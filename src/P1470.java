import java.util.Arrays;
import java.util.stream.Collectors;

public class P1470 {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < n && j < 2 * n; i++, j++) {
            result[j] = nums[i];
            result[++j] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ints = shuffle(nums, n);
        System.out.println(
                Arrays.stream(ints)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(", ", "[", "]")));
    }
}
