public class PrintAdjacent {
    public static String addMore(String str){
        if(str.length() <= 1){
            return str;
        }
        String add = (str.charAt(0)==str.charAt(1))? (str.charAt(0)+"*"):str.charAt(0)+"";
        return add + addMore(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(addMore("AABB"));
    }
}
