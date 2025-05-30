package RecursionSkillRiser;

public class StrongNumber {
    static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorial( num-1);
    }
    static int strongNum(int num,int sum){
        if(num == 0){
            return sum;
        }
        sum += factorial(num%10);
        return strongNum(num/10,sum);
    }
    static boolean isStrong(int num){
        return num == strongNum(num,0);
    }
    public static void main(String[] args) {
        int num = 147;
        if(isStrong(num)){
            System.out.println("It is a strong number.");
        }
        else{
            System.out.println("It is not a strong number.");
        }
    }
}
