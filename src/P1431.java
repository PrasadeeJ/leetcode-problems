import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy:candies){
            if (candy > max)
                max = candy;
        }
        List<Boolean> ans = new ArrayList<>();
        for(int candy:candies){
            ans.add((candy + extraCandies )>= max);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ints = kidsWithCandies(candies, extraCandies);
        for ( Boolean b : ints ) {
            System.out.println(b);
        }
    }
}
