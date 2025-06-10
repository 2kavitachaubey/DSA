package RecursionSkillRiser;

public class DiceTwo {
    public static void dice(int current,int total,String result){
        if(current == total){
            System.out.print(result+",");
            return;
        }
        if(current>total){
            return;
        }
        for(int i = 1; i <=6; i++){
            dice(current+i,total,result+i);
        }
    }
    public static void main(String[] args) {
        dice(0,10,"");
    }
}
