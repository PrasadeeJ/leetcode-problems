import java.util.Arrays;
import java.util.stream.Collectors;

public class P0009 {

    public static boolean isPalindrome(int x) {
        int n = 0;
        int temp = x;

        while(x!=0){
            int y=x%10;
            n=(n*10)+y;
            x=x/10;
        }
        if(temp==n)
            return true;
        else
            return false;
        }

    public static void main(String[] args) {
        int x = 122;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}
