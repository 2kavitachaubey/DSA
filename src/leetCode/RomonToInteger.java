package leetCode;
import java.util.*;
public class RomonToInteger {
    public static void main(String[] args) {
        String number = "CIII";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        for(int i = 0;i<number.length();i++){
            int current = map.get(number.charAt(i));
            int next = 0;
            if(i+1 < number.length()){
                next = map.get(number.charAt(i+1));
            }
            if(current < next){
                num -= current;
            }
            else {
                num += current;
            }
        }
        System.out.println(num);
    }
}
