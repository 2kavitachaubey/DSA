package Arrays;

public class Subsequence {
    public static void main(String[] args) {
        String s = "aza";
        String r = "abzca";
        int count = 0;
        int start = 0;
        for(int j = 0; j<s.length(); j++){
            for(int i =start; i<r.length(); i++){
                if(s.charAt(j)==r.charAt(i)){
                    count++;
                    start = i + 1;
                    break;
                }
            }
        }
        if(count == s.length()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
