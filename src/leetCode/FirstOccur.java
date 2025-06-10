package leetCode;

public class FirstOccur {
    public static void main(String[] args) {
        String first = "sadbutsad";
        String second = "sad";
        int num = -1;
        for(int j = 0; j<=(first.length()-second.length()); j++){
            if(first.charAt(j) == second.charAt(0)){
                if(second.equals(first.substring(j,j+second.length()))){
                    num = j;
                    break;
                }
            }
        }
        System.out.println(num);
    }
}
