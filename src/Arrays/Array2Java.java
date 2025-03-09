package Arrays;

import java.util.Arrays;
public class Array2Java {
    public static void main(String[] args){
        //Declare
        int[][] int2DArray;
        //Instantiate
        int2DArray = new int[2][2];

        //Initialize
        int2DArray[0][0] = 5;
        int2DArray[0][1] = 3;
        int2DArray[1][0] = 2;
        int2DArray[1][1] = 1;

        System.out.println(Arrays.deepToString(int2DArray));

        String int2array[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(int2array));
    }
}
