package BacktrackingSR;

public class Alpha {
    public static void forAll(int len, String result){
        if(len == 0){
            System.out.print(result+ ", ");
            return;
        }
        for(char single = 'A'; single <= 'Z'; single++){
            if(single == 'A' || single == 'E' || single == 'I'|| single == 'O' || single == 'U'){// Backtracking condition only for what we need.
                forAll(len-1,result+single);
            }
        }
    }
    public static void main(String[] args) {
        forAll(8,"");
    }
}
