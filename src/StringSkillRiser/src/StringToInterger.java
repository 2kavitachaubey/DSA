public class StringToInterger {
    public static void addString(String name,int add){
        if(name.length() == 0){
            System.out.println(add);
            return ;
        }
        add += (int)name.charAt(0);
        addString(name.substring(1),add);
    }
    public static void main(String[] args) {
        String str = "kavita";
        int add = 0;
        for(int i = 0;i<str.length();i++){
            add += (int)str.charAt(i);
        }
        System.out.println(add);
        addString("Radha",0);
    }
}
