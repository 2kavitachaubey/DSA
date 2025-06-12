package RecursionSkillRiser;

public class Permutation {
    public static void permut(String str,String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char current = str.charAt(i);
            String remStr = str.substring(0,i)+str.substring(i+1);
            permut(remStr,result+current);
        }
    }
    public static void main(String[] args) {
        permut("ABCD","");
    }
}
