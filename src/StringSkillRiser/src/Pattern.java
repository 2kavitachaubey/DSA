public class Pattern {
    public static void black(int t){
        if(t == 0){
            return ;
        }
        System.out.print(" ");
        black(t-1);
    }
    public static void shape(int s){
        if(s == 0){
            return ;
        }
        System.out.print("*");
        shape(s-1);
    }
    public static void pattern(int times){
        if(times == 0){
            return ;
        }
        pattern(times-1);
        black(5-times);
        shape(2*times -1);
        System.out.println();
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
