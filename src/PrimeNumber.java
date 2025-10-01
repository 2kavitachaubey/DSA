public class PrimeNumber {
    public static void main(String[] args) {
        int num = 6;
        boolean flag = true;
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
