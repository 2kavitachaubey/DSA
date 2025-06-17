package BacktrackingSR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Combination {
    public static List<List<Integer>> combine(int n ,int k){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        helper(1,n,k,list,small);
        return list;
    }
    public static void helper(int start,int n,int k,List<List<Integer>> finalArr,List<Integer> smallArr){
        if(smallArr.size() == k){
            finalArr.add(new ArrayList<>(smallArr));
        }
        for(int i = start; i <= n;i++){
            if(!smallArr.contains(i)){
                smallArr.add(i);
                helper(i+1,n,k,finalArr,smallArr);
                smallArr.remove(smallArr.size()-1);
            }

        }
    }
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
