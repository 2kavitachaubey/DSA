package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class StringAutoWrite {
    public static void main(String[] args) {
        String str = "Hello world this is a new world and this is just the beginning of a new world";
        ArrayList<String> arr = new ArrayList<>();
        String newStr = "";
        int start = 0;
        for(int i = 0;i <str.length();i++){
            newStr = "";
            if(str.charAt(i) == ' '){
                for(int j = start; j < i; j++){
                    newStr = newStr + str.charAt(j);
                }
                arr.add(newStr);
                start = i+1;
            }
        }
        newStr = "";
        for(int i = start; i < str.length(); i++){
            newStr += str.charAt(i);
        }
        arr.add(newStr);

        HashSet<String> printed = new HashSet<>();

        for(int i = 0; i<arr.size(); i++){
            for(int j = i+1; j<arr.size(); j++){
                if(arr.get(i).equals(arr.get(j)) && !printed.contains(arr.get(i))){
                    System.out.println(arr.get(i));
                    printed.add(arr.get(i));
                }
            }
        }
    }
}
