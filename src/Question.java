//import java.util.*;
//
//public class Question {
//    public static void main(String [] args ){
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

        //QUESTION 6
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

        // QUESTION 7
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

        //QUESTION 8
//        String s= "I'm the Kavita Chaubey";
//        int sum = 0;
//        for(int i = s.length()-1; i>=0; i--){
//            if(s.charAt(i) == ' ' && sum ==0){
//                continue;
//            }else if(s.charAt(i)==' ' && sum>0 ){
//                break;
//            }
//            else{
//                sum++;
//            }
//        }
//        System.out.println(sum);

        //QUESTION 9

//    }
//}

//import java.util.Scanner;
//public class Question {
//    static int sumOfDigit(int n) {
//        int sum = 0;
//        int count = 0;
//        while( n != 0 ){   // while because we don't know where the loop will end
//            count++;
//            int r = n % 10;
//            sum += r;
//            n /= 10;
//        }
//        System.out.println("The number of digits in number: " + count);
//        return sum;
//    }
//    public static void main(String [] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);  //system -- class
//        System.out.println("Enter the value of num: ");
//        n = sc.nextInt(); // it is a method
//        System.out.println("The sum of digit: "+ sumOfDigit(n));
//    }
//}

import java.util.Scanner;

public class Question {
    	static boolean prime(int n) {
		for(int i=2; i<n;i++) {
			if(n%i == 0) {
			return false;
			}
		}
		for(int i=2; i<n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		for(int i=2; i<Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;

	}

    public static void main(String [] args) {
        int n;
        Scanner sc = new Scanner(System.in);  //system -- class
        System.out.println("Enter the value of number: ");
        n = sc.nextInt(); // it is a method
		if(prime(n)) {
			System.out.println("It's a prime number.");
		}else System.out.println("It's not a prime number");

		int year = 1960;
		if((year % 4 == 0 && year % 100 != 0 )|| year % 400 ==0){
			System.out.println("It's a leap year");
		}
		else{
			System.out.println("It's not a leap year");
		}

		// QUESTION 4....
		int marks = 95;
		if(marks >= 90 && marks <= 100){
			System.out.println("A");
		}
		else if(marks >= 80 && marks <= 89){
			System.out.println("B");
		}
		else if(marks >= 70 && marks <= 79){
			System.out.println("C");
		}else if(marks >= 60 && marks <= 69){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
    }

	// QUESTION 3.....


}

