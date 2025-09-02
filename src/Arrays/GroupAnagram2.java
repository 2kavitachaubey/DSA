package Arrays;

import java.util.*;

public class GroupAnagram2 {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(String word: str){
            char [] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String key = new String(wordArr);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(word);
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}
