package RecursionSR;

public class Pattern2 {
    public static void empty(int n){
        if(n == 1){
            return;
        }
        System.out.print(" ");
        empty(n-1);
    }
    public static void rob(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        rob(star-1);
    }
    public static void pattern(int n,int row){
        if(n==0){
            return;
        }
        empty(n);
        rob(row);
        System.out.println();
        pattern(n-1,row);
    }
    public static void main(String[] args) {
        pattern(4,4);
    }
}
