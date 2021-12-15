public class P2011 {

    public  static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i:operations){
            if(i.equals("++X")||i.equals("X++")){
                x++;
            }if(i.equals("--X")||i.equals("X--"))
                x--;
        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

}
