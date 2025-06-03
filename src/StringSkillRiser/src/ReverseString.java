public class ReverseString {
    public static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String newString = reverse(str.substring(1));
        char firstChar = str.charAt(0);
        return newString + firstChar;
    }
    public static void main(String[] args) {
        String r = reverse("Kavita");
        System.out.println(r);
    }
}
