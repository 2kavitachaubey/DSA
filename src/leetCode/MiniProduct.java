package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MiniProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount >= 1 && amount <=1000){
            int operation = sc.nextByte();
            int al = 0;
            int arr[] = new int[operation];
            int newarr[] = new int[operation];
            sc.nextLine();
            if(operation>=1 && operation<=50){
                for(int i=0; i<operation;i++) {
                    String perform = sc.nextLine();
                    String[] str = perform.split(" ");
                    int val = str.length > 1 ? Integer.parseInt(str[1]) : 0;
                    if(str[0].equals("credit")){
                        amount += val;
                        arr[al] = -val;
                        al++;
                    }else if(str[0].equals("debit")){
                        arr[al] = val;
                        al++;
                        amount -= val;
                    }else if(str[0].equals("abort")) {
                        int m = val-1;
                        amount += arr[m];
                    }else if(str[0].equals("rollback")){
                        int n = val;
                        if(n >= 0 && n < newarr.length) {
                            amount = newarr[n];
                        }
                    }else if(str[0].equals("commit")){
                        for(int j = 0; j<arr.length; j++){
                            arr[j] = 0;
                        }
                    }else if(str[0].equals("read")){
                        System.out.println(amount);
                    }
                    newarr[i] = amount;
                }
            }
        }
    }
}
