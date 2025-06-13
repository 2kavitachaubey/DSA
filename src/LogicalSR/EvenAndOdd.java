package LogicalSR;

public class EvenAndOdd {
    public static void main(String[] args) {
        int num = 1832;
        int pos = 0 ;
        int even = 0;
        int odd = 0;
        while(num !=0) {
            int lastDigit = num % 10;
            pos++;
            if (pos % 2 == 0) {
                even += lastDigit;
            } else {
                odd += lastDigit;
            }
            num /= 10 ;
        }
        System.out.println("Even Path: "+ even);
        System.out.println("Odd Path: "+ odd);
    }
}
