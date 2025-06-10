package leetCode;

public class AddBinary {
    public static void main(String[] args) {
        String b1= "1001";
        String b2 = "1001";
        String newB = "";
        int carry = 0;
        int length  = 0;
        if(b1.length() > b2.length()){
            length = b1.length();
        } else {
            length =b2.length();
        }
        for(int i = length-1; i>=0; i--){
            char ch1 = b1.charAt(i);
            char ch2 = b2.charAt(i);
            int c1 = ch1 - '0';
            int c2 = ch2 -'0';
            int sum = c1 + c1 + carry;
            if(sum == 0){
                newB = "0" + newB;
                carry = 0;
            }
            else if(sum == 1){
                newB = "1" + newB;
                carry = 0;
            }
            else if(sum == 2){
                newB = "0"+ newB;
                carry= 1;
            }
            else if(sum == 3){
                newB = "1" + newB;
                carry = 1;
            }
        }
        if(carry == 1){
            newB = "1" + newB;
        }
        System.out.println(newB);
    }
}
