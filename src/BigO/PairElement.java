package BigO;

// n^2
public class PairElement {
    void pair(int[] array){
        for(int i = 0 ; i<array.length; i++){
            for (int j = 0; j<array.length; j++){
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
    public static void main(String[] args) {
        PairElement p = new PairElement();
        int[] pairs = {1,2,3,4};
        p.pair(pairs);
    }
}
