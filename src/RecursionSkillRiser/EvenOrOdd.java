package RecursionSkillRiser;

public class EvenOrOdd {
    static void count(int num,int even,int odd){
        if(num == 0){
            System.out.println("Even count: "+ even);
            System.out.println("Odd count: "+ odd);
            return;
        }
        if((num%10)%2 == 0) even++;
        else odd++;
        count(num/10,even,odd);
    }
    public static void main(String[] args) {
        count(122222,0,0);
    }
}
