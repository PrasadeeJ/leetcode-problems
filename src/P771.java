import java.util.HashSet;

public class P771 {

    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        for(char j: jewels.toCharArray()){
            hs.add(j);
        }
        for(char s: stones.toCharArray()){
            if(hs.contains(s)){
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));


    }

}
