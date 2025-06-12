package RecursionSkillRiser;

public class Josephus {
    public static int sword(int key, int n){
        if(n == 1){
            return 0;
        }
        return (sword(key, n-1) + key) % n;
    }
    public static void main(String[] args) {
        System.out.println(sword(3,5));
    }
}
