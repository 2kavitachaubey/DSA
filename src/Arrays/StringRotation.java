package Arrays;

public class StringRotation {
    public static boolean areSame(String name, String name2){
        for(int i = 0 ; i<name.length(); i++){
            if(name.charAt(i) != name2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static int arr(String name, String name2,int len){
        if(name.length() != name2.length()){
            return -1;
        }
        if(len==0){
            return -1;
        }
        if(areSame(name,name2)){
            return 1;
        }
        return arr(name, (name2.substring(1)+name2.charAt(0)),len-1);
    }
    public static void main(String[] args) {
        String name= "kavitia";
        String name2 = "tiakavi";
        System.out.println(arr(name,name2,name.length()));
    }
}
