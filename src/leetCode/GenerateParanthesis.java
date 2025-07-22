package leetCode;
import java.util.*;
public class GenerateParanthesis {
    public static List<String> generate(int n){
        List<String> result = new ArrayList<>();
        code(n,result,0,0,"");
        return result;
    }
    public static void code(int n, List<String> finalList, int opening, int closing,String str){
        if(str.length() == n*2){
            finalList.add(str);
            return ;
        }
        if(opening<n){
            code(n,finalList,opening+1,closing,str+'(');
        }
        if(closing<opening){
            code(n,finalList,opening,closing+1,str+')');
        }
    }
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
