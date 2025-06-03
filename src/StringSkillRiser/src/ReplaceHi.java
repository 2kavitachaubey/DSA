public class ReplaceHi {
    static String replace(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
            String newString = replace(str.substring(2));
            return "hello" + newString;
        }
        else{
            String newString = replace(str.substring(1));
            return str.charAt(0)+newString;
        }
    }
    public static void main(String[] args) {
        System.out.println(replace("hi kavita hi chaubey"));
    }
}
