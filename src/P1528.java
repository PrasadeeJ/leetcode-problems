public class P1528 {

    public static String restoreString(String s, int[] indices) {
        StringBuilder string = new StringBuilder(s);
        for(int i=0; i< indices.length; i++){
            string.setCharAt(indices[i], s.charAt(i));
        }
        return string.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String output = restoreString(s , indices);
        System.out.println(output);
    }
}
