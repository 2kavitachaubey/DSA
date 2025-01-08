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
        int arr[] = {1,4,2,7,8,2};
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

        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to count: ");
        int num = sc.nextInt();
        for( int value: arr){
            if(value == num){
                count++;
            }
        }
        if(count > 0){
            System.out.println("It occurs in " + count + " times.");
        }else {
            System.out.println("It doesn't occur in array.");
        }

    }
}
