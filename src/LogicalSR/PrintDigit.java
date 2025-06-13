package LogicalSR;

public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int cpy= num;
        int pow = 1;
        while(cpy > 10){
            pow *= 10;
            cpy/=10;
        }
        while(pow != 0){
            int i = num/pow;
            System.out.println(i);
            num %= pow;
            pow /= 10;
        }
    }
}
