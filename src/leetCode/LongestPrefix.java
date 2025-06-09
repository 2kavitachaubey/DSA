package leetCode;

public class LongestPrefix {
    public static void main(String[] args) {
        String [] strs = {"Hello","Hey","Hell"};
        String myString = "";
        for(int i = 0;i<strs[0].length(); i++) {
            char firstChar = strs[0].charAt(i);
            boolean ifTrue = true;
            for (int j = 1; j < strs.length; j++) {
                if (firstChar != strs[j].charAt(i)) {
                    ifTrue = false;
                }
            }
            if(ifTrue){
                myString += strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        if(myString != ""){
            System.out.println(myString);
        }
        else{
            System.out.println("it's empty");
        }
    }
}
