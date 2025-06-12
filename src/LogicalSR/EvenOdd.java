package LogicalSR;

public class EvenOdd {
    public static void select(int n){
        // logic 1
        if(n % 2 ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        // Xor
        if((n ^ 1) == n+1){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        // And
        if((n & 1)== 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //or
        if((n | 1) > n){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        select(7);
    }
}
