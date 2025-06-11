package RecursionSkillRiser;

import javax.print.attribute.standard.PresentationDirection;

public class Subsquence {
    public static void string(String str,String result){
        if(str.length() ==0){
            System.out.println(result + "  ---> mai print ho gya");
            return;
        }
        string(str.substring(1),result);

        string(str.substring(1),result+str.charAt(0));
    }
    public static void main(String[] args) {
        string("abc","");
    }
}
