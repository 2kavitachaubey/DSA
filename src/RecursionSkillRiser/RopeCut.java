package RecursionSkillRiser;

public class RopeCut {
    public static int robe(int ropeLen,int a,int b,int c){
        if(ropeLen == 0){
            return 0;
        }
        if(ropeLen < 0){
            return -1;
        }
        int optionA = robe(ropeLen-a,a,b,c);
        int optionB = robe(ropeLen-b,a,b,c);
        int optionC = robe(ropeLen-c,a,b,c);
        int finalResult = Math.max(Math.max(optionA,optionB),optionC);
        if(finalResult == -1){
            return -1;
        }
        return finalResult+1;

    }
    public static void main(String[] args) {
        System.out.println(robe(5,2,5,1));
    }
}
