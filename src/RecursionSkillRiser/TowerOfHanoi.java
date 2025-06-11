package RecursionSkillRiser;

public class TowerOfHanoi {
    public static void tower(int n, char A, char B, char C){
        if(n == 0){
            return;
        }
        tower(n-1, A, C, B);
        System.out.println("From disk form " + A + " to " + C);
        tower(n-1, B, A, C);
    }
    public static void main(String[] args) {
        tower(3,'A','B','C');
    }
}
