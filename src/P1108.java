public class P1108 {

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String input = "1.1.1.1";
        String output = defangIPaddr(input);
        System.out.println(output);
    }
}
