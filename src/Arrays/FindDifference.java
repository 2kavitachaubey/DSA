package Arrays;

public class FindDifference {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        char r = 0;
        for(char e : s.toCharArray()){
            r ^= e;
        }
        for(char e : t.toCharArray()){
            r ^= e;
        }
        System.out.println(r);
    }
}
