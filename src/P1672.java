public class P1672 {

    public static int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int i=0; i<accounts.length; i++) {
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts  = {{1,2,3},{3,2,1}};
        int output = maximumWealth(accounts);
        System.out.println(output);
    }
}
