package RecursionSkillRiser;

public class MazeProblem {
    public static void maze(int row, int col, int endrow,int endcol,String result){
        if(row == endrow && col == endcol){
            System.out.println(result);
            return;
        }
        if(row > endrow || col > endcol){
            return;
        }
        maze(row,col+1,endrow,endcol,result+"H");
        maze(row+1,col,endrow,endcol,result+"V");
    }
    public static void main(String[] args) {
        maze(0,0,2,2,"");
    }
}
