import java.util.Arrays;
public class Array2Main {
    public static void main(String[] args){
        Array2_1Java a12 = new Array2_1Java(2,3);
        a12.insert(0,0,23);
        a12.insert(0,1,27);
        a12.insert(1,0,25);
        a12.insert(1,2,31);
        a12.insert(1,1,34);

        a12.access(0,1);

        a12.traverse();

        a12.search(25);
        a12.search(21);

        System.out.println(Arrays.deepToString(a12.arr));

        a12.deleteValue(1,2);

        System.out.println(Arrays.deepToString(a12.arr));
    }
}
