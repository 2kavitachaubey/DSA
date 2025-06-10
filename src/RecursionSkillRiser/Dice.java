package RecursionSkillRiser;

import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    public static void dice(int one, int two, int total, ArrayList<String> s){
        if((one + two) == total){
            String on = one + " " + two;
            if(!s.contains(on)){
                s.add(on);
            }
            return;
        }
        if(one > 5 || two > 5){
            return;
        }
        dice(one,two+1,total,s);
        dice(one+1,two,total,s);
    }
    public static void main(String[] args) {
        ArrayList<String> value = new ArrayList<>();
        dice(0,0,11,value);
        for(String s: value){
            System.out.println(s);
        }
    }
}
