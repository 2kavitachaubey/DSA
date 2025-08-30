package Arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int num[] = {0,1,0,3,12};
        int write = 0;
        for(int read = 0; read<num.length; read++){
            if(num[read]!=0){
                num[write] = num[read];
                write++;
            }
        }
        while(write<num.length){
            num[write] = 0;
            write++;
        }
        System.out.println(Arrays.toString(num));
    }
}
