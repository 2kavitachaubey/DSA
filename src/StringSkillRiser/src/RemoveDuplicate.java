public class RemoveDuplicate {
    public static String remove(String str){
        if(str.length()<=1){
            return str;
        }
        String character = (str.charAt(0) != str.charAt(1))? str.charAt(0)+"":"";
        return character + remove(str.substring(1));
//        String newString = remove(str.substring(1));
//        if(str.charAt(0) != str.charAt(1)){
//            return str.charAt(0)+newString;
//        }
//        else{
//            return newString;
//        }
    }
    public static void main(String[] args) {
        System.out.println(remove("AAAABBBCCDCC"));
    }
}
