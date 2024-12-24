import java.util.Arrays;
public class Array2Main {
    public static void main(String[] args){
        Array2_1Java a12 = new Array2_1Java(2,3);
        a12.insert(0,0,23);
        a12.insert(0,1,27);
        a12.insert(0,0,25);

        System.out.println(Arrays.deepToString(a12.arr));
    }
}
