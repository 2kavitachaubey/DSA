package LogicalSR;

public class GreaterThanfour {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 10;
        int n3= 80;
        int n4 = 90;
        if(n1>n2){
            if(n3>n4){
                if(n1>n3){
                    System.out.println(n1);
                }
                else {
                    System.out.println(n3);
                }
            }
            else{
                if(n1>n4){
                    System.out.println(n1);
                }
                else{
                    System.out.println(n4);
                }
            }
        }
        else{
            System.out.println(n2);
        }
    }
}
