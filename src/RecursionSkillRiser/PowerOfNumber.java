package RecursionSkillRiser;

public class PowerOfNumber {
    int power1(int number,int pow){
        if(pow == 1){
            return number;
        }
        int result = power1(number,pow-1);
        return result * number;
    }
    void power(int number,int pow,int sum){
        if(pow ==0){
            System.out.println(sum);
            return;
        }
        power(number,pow-1,sum*number);
    }
    public static void main(String[] args) {
        PowerOfNumber p = new PowerOfNumber();
        p.power(11,3,1);
    }
}
