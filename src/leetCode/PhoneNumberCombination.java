package leetCode;

import java.util.*;

public class PhoneNumberCombination {
    static String[] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> phone(String digits){
        if(digits.length()==0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        List<String> newList = new ArrayList<>();

        char firstDigit = digits.charAt(0);
        int digitIndex = firstDigit - '0';
        String letter = str[digitIndex];
        System.out.println("I'm new List: " + letter);

        for(int i = 0;i<letter.length();i++){
            List<String> oldList = phone(digits.substring(1));
            System.out.println("Old: " + oldList);
            for(int j = 0;j<oldList.size();j++){
                newList.add(letter.charAt(i) + oldList.get(j));
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        System.out.println(phone("675"));
    }
}
