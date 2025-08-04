package Arrays;

import java.util.HashMap;

public class StringAutoWriteHashMap {
    public static void main(String[] args) {
        String str = "Hell world this is a new world and this is just the beginning of a new world";
        str = str.toLowerCase();

        String[] strArr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

//        StringBuilder newStr = new StringBuilder();

        for(String word : strArr){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println(map.keySet());

        for(String key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key);
            }
        }
    }
}
