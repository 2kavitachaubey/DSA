public class Palindrome {
    public static void main(String [] args){
        int number = 2002;
        int temp = number;
        int newNum = 0;
        while(temp>0){
            int rem = temp%10;
            newNum = (newNum*10) + rem;
            temp = temp /10;
        }
        System.out.println(newNum);
    }
}
