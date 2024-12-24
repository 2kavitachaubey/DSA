import java.util.Arrays;
public class Array2Java {
    public static void main(String[] args){
        //Declare
        int[][] int2Array;
        //Instantiate
        int2Array = new int[2][2];

        //Initialize
        int2Array[0][0] = 4;
        int2Array[0][1] = 3;
        int2Array[1][0] = 2;
        int2Array[1][1] = 1;

        System.out.println(Arrays.deepToString(int2Array));

        String int2array[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(int2array));
    }
}
