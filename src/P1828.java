import java.util.Arrays;
import java.util.stream.Collectors;

public class P1828 {

        public static int[] countPoints(int[][] points, int[][] queries) {
            int[] result = new int[queries.length];
            for(int i=0; i<queries.length; i++){
                //2,3,1
                int vals=0;
                for(int j=0; j<points.length; j++){
                    //x^2+y^2<=r^2
                    //13 33 53 22
                    if(  (  ((queries[i][0]-points[j][0])*(queries[i][0]-points[j][0]))   +
                            ((queries[i][1]-points[j][1])*(queries[i][1]-points[j][1]))   )
                            <= queries[i][2]*queries[i][2]   ){
                        vals++;
                    }
                    }
                    result[i]=vals;
                }
            return result;
            }



    public static void main(String[] args) {
            int[][] points = {{1,3},{3,3},{5,3},{2,2}};
            int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
            int[] ints = countPoints(points,queries);
        System.out.println(
                Arrays.stream(ints)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(", ", "[", "]")));
    }


}
