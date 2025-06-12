package RecursionSR;

public class Pattern1 {
    public static void result(int n){
        if(n == 0){
            return;
        }
        System.out.print("* ");
        result(n-1);
    }
    public static void hollowLine(int n,int line){
        if(line > n){
            return;
        }
        if(line==n|| line ==1){
            System.out.print("* ");
        }else {
            System.out.print("  ");
        }
        hollowLine(n,line+1);
    }
    public static void pattern(int n,int row){
        if(n==0){
            return;
        }
        if(n == 1 || row == n){
            result(n);
        }
        else {
            hollowLine(n,1);
        }
        System.out.println();
        pattern(n-1,row);
    }
    public static void main(String[] args) {
        pattern(10,10);
    }
}
