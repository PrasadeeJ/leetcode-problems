import java.util.HashSet;

public class P1832 {

        public static boolean checkIfPangram(String sentence) {
            HashSet<Character> test = new HashSet<Character>();
            for (char c : sentence.toCharArray()) {
                test.add(c);
            }
            return test.size() == 26;

        }

        public static void main(String[] args) {
            String s = "thequickbrownfoxjumpsoverthelazydog";
            System.out.println(checkIfPangram(s));
        }
}
