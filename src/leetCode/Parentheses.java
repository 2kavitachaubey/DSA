package leetCode;

public class Parentheses {
    public static void main(String[] args) {
        String s = "({[()]})";
        boolean t = true;
        int round = 0;
        int square = 0;
        int curly = 0;
        for(int i = 0; i<s.length();i++){
            char sChar = s.charAt(i);
            if(sChar == '(') round ++;
            else if(sChar == ')') round --;
            else if(sChar == '[') square ++;
            else if(sChar == ']') square --;
            else if(sChar == '{') curly ++;
            else if(sChar == '}') curly --;

            if(round < 0 || square < 0 || curly < 0){
                t = false;
                return;
            }
        }
        if(round == 0 && square == 0 && curly == 0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
}
