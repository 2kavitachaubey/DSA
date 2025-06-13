package LogicalSR;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 2325;
        int newNum = 0;
        while(num != 0){
            newNum = (newNum*10) + (num % 10);
            num /= 10;
        }
        System.out.println(newNum);
    }
}
