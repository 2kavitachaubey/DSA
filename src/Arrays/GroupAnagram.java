package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
    public static boolean isAnagram(String check, String word){
        if(check.length() != word.length()){
            return false;
        }
        char[] c1 = check.toCharArray();
        char[] c2 = word.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> bigList = new ArrayList<>();
        for(String word: str){
            boolean flag = false;
            for(List<String> smallList : bigList){
                if(isAnagram(smallList.get(0),word)){
                    smallList.add(word);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                List<String> newList = new ArrayList<>();
                newList.add(word);
                bigList.add(newList);
            }
        }
        System.out.println(bigList);
    }
}
