package RecursionSkillRiser;

public class ConvertBinaryToDecimal {
    static int count(int number,int pow, int sum){
//        if(number == 0){
//            return 0;
//        }
//        int sum = count(number/10,pow+1);
//        return sum + (number%10 * (int)Math.pow(2,pow));

        if(number == 0){
            return sum;
        }
        sum += (number%10 * (int)Math.pow(2,pow));
        return count(number/10,pow+1,sum);

    }
    public static void main(String[] args) {
        int binary = 10000000;
        System.out.println(count(binary,0,0));
    }
}
