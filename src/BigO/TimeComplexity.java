package BigO;

// n
public class TimeComplexity {
    void calculate(int[] array){
        int sum = 0;
        int mul = 1;
        for(int i: array){
            sum+=i;
        }
        for(int i: array){
            mul*=i;
        }
        System.out.println("Addition: "+ sum+ " Multiplication: "+ mul);
    }
    public static void main(String[] args) {
        TimeComplexity t = new TimeComplexity();
        t.calculate(new int[]{4,5,3,2});
    }
}

