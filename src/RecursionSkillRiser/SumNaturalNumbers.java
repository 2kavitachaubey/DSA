package RecursionSkillRiser;

public class SumNaturalNumbers {
    static int sumNatural(int num,int sum){
        if(num == 0){
            return sum;
        }
        sum += num;
        return sumNatural(num-1,sum);
    }
    public static void main(String[] args) {
        System.out.println(sumNatural(1234,0));
    }
}
