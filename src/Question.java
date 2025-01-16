import java.util.*;

public class Question {
    public static void main(String [] args ){
//        int arr[] = {1,1,2,2,3,4,5};

        // QUESTION 1
//        int[] newArr = new int[arr.length];
//        int index = 0;
//
//        for(int i=0; i < arr.length-1 ; i++){
//            if(arr[i] != arr[i+1]){
//                newArr[index++] = arr[i];
//            }
//        }
//        newArr[index++] = arr[arr.length-1];
//        newArr = Arrays.copyOf(newArr,index);
//        System.out.println(Arrays.toString(newArr));

        //QUESTION 2
//        int arr[] = {1,4,2,7,8,2};
//        int highest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        for(int value: arr){
//            if(value>highest){
//                highest=value;
//            }
//            if(value<smallest){
//                smallest = value;
//            }
//        }
//        System.out.println(highest);
//        System.out.println(smallest);

        //QUESTION 3

//        int count =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to count: ");
//        int num = sc.nextInt();
//        for( int value: arr){
//            if(value == num){
//                count++;
//            }
//        }
//        if(count > 0){
//            System.out.println("It occurs in " + count + " times.");
//        }else {
//            System.out.println("It doesn't occur in array.");
//        }

        //QUESTION 4
//        String [] strings = {"hello","world","hell","yeah"};
//        String prifix = "hel";
//        int count=0;
//
//        for(int i = 0; i< strings.length; i++){
//            boolean isprifix = true;
//            if(strings[i].length() >= prifix.length()){
//                for(int j = 0; j< prifix.length() ; j++){
//                    if(strings[i].charAt(j) != prifix.charAt(j)){
//                        isprifix = false;
//                        break;
//                    }
//                }
//            }
//            if(isprifix){
//                count++;
//            }
////            if(strings[i].startsWith(prifix)){
////                count++;
////            }
//        }
//        System.out.println(count);

        // QUESTION 5
//        int target = 9;
//        int[] result = new int[2];
//        for( int i = 0 ; i< arr.length-1; i++){
//            for(int j = i+1; j< arr.length; j++){
//                if((arr[i] + arr[j]) == target){
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(result));

//        int x;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        x = sc.nextInt();
//        int r, n = 0, original = x;
//        while(x>0){
//            r = x % 10;
//            n = n * 10 + r;
//            x = x / 10;
//        }
//        if(n == original){
//            System.out.println(original +" is a palindrome.");
//        }else{
//            System.out.println(original + " is not a palindrome.");
//        }

//        int nums[] = {1,1,2,7,8,2};
//        int index = 1;
//        int count = 0;
//        for(int i = 0 ;i<nums.length-1;i++){
//            if(nums[i] != nums[index]){
//                count++;
//            }
//            index++;
//        }
//        System.out.println(count);

        String strings[] = "My name is Kavita Chaubey   ";
        int count = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' ' && count ==0){
                continue;
            }else if(s.charAt(i)==' ' && count>0 ){
                break;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
