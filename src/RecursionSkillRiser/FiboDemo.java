package RecursionSkillRiser;

public class FiboDemo {
    public static int fibo(int num){
        if(num<=1){
            return num;
        }
        return fibo(num-1)+fibo(num-2);
    }
    public static void main(String[] args) {
        int result = fibo(8);
        System.out.println(result);
    }
}
