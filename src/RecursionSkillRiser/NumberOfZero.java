package RecursionSkillRiser;

public class NumberOfZero {
    static void countZero(int number,int count){
        if(number == 0){
            System.out.println(count);
            return;
        }
        if(number % 10 == 0){
            count++;
        }
        countZero(number/10,count);
    }
    static int countZeros(int number){
        if(number == 0){
            return 0;
        }
        int zeros = countZeros(number/10);
        int digit = number%10;
        return zeros + (digit == 0? 1:0);
    }
    public static void main(String[] args) {
        countZero(100240240,0);
        System.out.println(countZeros(124002320));
    }
}
