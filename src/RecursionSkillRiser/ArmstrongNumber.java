package RecursionSkillRiser;

public class ArmstrongNumber {

    int count(int num){
        if(num==0){
            return num;
        }
        int count = count(num/10);
        return count + 1;
    }

    void armstrong(int number , int result,int count, int copy){
        if(number == 0){
            System.out.println(result == copy? "Is an Armstrong number":"Is not an Armstrong number");
            return;
        }
        result += (int)Math.pow(number%10,count);
        armstrong(number/10,result,count,copy);
    }

    public static void main(String[] args) {
        ArmstrongNumber a1 = new ArmstrongNumber();
        int value = 153;
        int count = a1.count(value);
        a1.armstrong(value,0,count,value);


        System.out.println("\nBy Basic method...");
        int number = value;
        int pow = 0;

        while(number != 0){
            pow++;
            number /= 10;
        }
        System.out.println("number of digit : " + pow);

        number = value;
        int result = 0;
        while(number != 0){
            result += (int)Math.pow((number%10),pow);
            number /= 10;
        }

        System.out.println(result);
        if(result == value){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
