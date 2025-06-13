package LogicalSR;

public class PrimeNumber {
    public static void main(String[] args) {
        int prime = 23;
        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(prime); i++){
            if(prime % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("is prime");
        }else{
            System.out.println("not prime");
        }
    }
}
