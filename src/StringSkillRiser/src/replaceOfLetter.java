public class replaceOfLetter {
    public static String replace(String str,char search,char replace){
        if(str.length()==0){
            return "";
        }
        char change = (str.charAt(0)=='l')?'x':str.charAt(0);
        return change + replace(str.substring(1),search,replace);
//        String r = replace(str.substring(1),search,replace);
//        if(str.charAt(0) == search){
//            return replace + r;
//        }
//        else{
//            return str.charAt(0)+r;
//        }
    }
    public static void main(String[] args) {
        System.out.println(replace("hello",'l','x'));
    }
}
