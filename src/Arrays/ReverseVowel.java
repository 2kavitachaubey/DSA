package Arrays;

import java.util.Arrays;

public class ReverseVowel {
    public static boolean isVowel(char [] c,int index){
        return "AEIOUaeiou".indexOf(c[index])>=0;
    }
    public static void main(String[] args) {
        String str = "sEkjIlOunU";
        System.out.println(str);
        char ch[] = str.toCharArray();
        int low = 0;
        int high = ch.length-1;
        while(low<high){
            if(!isVowel(ch,low)){
                low++;
            }
            else if(!isVowel(ch,high)){
                high--;
            }
            else{
             char temp = ch[low];
             ch[low] = ch[high];
             ch[high] = temp;
             high--;
             low++;
            }
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(new String(ch));
    }
}
