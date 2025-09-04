package Arrays;

public class ReverseString {
        public static String reverseString(String str)
        {
            //Write your code here
            char[] chr = str.toCharArray();
            int start = chr.length;
            StringBuilder newStr = new StringBuilder();
            for(int i = chr.length-1; i>=0; i--){
                if(chr[i]==' '){
                    if(i+1<start) {
                        for(int j = i+1; j<start; j++){
                            newStr.append(chr[j]);
                        }
                        newStr.append(" ");
                    }
                    start = i;
                }else if(i==0){
                    for(int j = i; j<start;j++){
                        newStr.append(chr[j]);
                    }
                    System.out.println(newStr);
                }
            }
            return newStr.toString();
        }

        public static void main(String[] args) {
            System.out.println(reverseString("Welcome to New York."));
        }
}
