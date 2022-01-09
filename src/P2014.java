public class P2014 {

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence: sentences){
            int count = sentence.split(" ").length;
            max = count>max ? count : max;
        }
        return max;
    }

    public static void main(String[] args) {
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int output = mostWordsFound(sentences1);
        System.out.println(output);
    }


}
