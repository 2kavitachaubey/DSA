public class ibonacci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        if(n>2){
            System.out.print(a + " " + b + " ");
        }
        for(int i = 2; i<n; i++){
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
