import java.util.Scanner;
public class CollegeCode {
    public static void main(String [] args){
//        var a = 10; // Implicit type or type Inference- when we know the value
//        int b ; // Explicit Type
//        b = 100;

        // Constant
        final int MAX = 100;

        // Data type = 1.primitive type- value type = 2.reference type- secondart type

//        int num1 = 10;
//        int m = num1;
//        //immutability  - don't not change original value
//        //mutability - change original value
//        System.out.println(num1);
//        System.out.println(num1+10);

        byte age = 20;
        long number = 100000000L;
        float price = 30.45f; //F or f
        double amount = 100000.34353d; //D or d
        char myWord = 'क';
        System.out.println(myWord);

        String name = "Kavita Chaubey";


        //QUESTIONS.......
        // QUESTION 1

        int a = 10 ;
        int b = 20 ;
        int c = 40;
//        if(a>b && a>c){
//            System.out.println(a);
//        }
//        else if(b>c && b>a){
//            System.out.println(b);
//        }
//        else{
//            System.out.println(c);
//        }

        if(a>b){
            if(a>c) System.out.println(a);
            else System.out.println(c);
        }
        else{
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }

        // QUESTION 2....

//        int num1 = 100;
//        int num2 = 120;
//        int num3 = 60;
//        int num4 = 70;
//
//        if(num1 > num2){
//            if(num1 > num3){
//                if(num1 > num4){
//                    System.out.println(num1);
//                }
//                else {
//                    System.out.println(num4);
//                }
//            }
//            else {
//                if(num3 > num4){
//                    System.out.println(num3);
//                }
//                else{
//                    System.out.println(num4);
//                }
//            }
//        }
//        else {
//            if(num2 > num3){
//                if(num2 > num4){
//                    System.out.println(num2);
//                }
//                else {
//                    System.out.println(num4);
//                }
//            }
//            else {
//                if(num3 > num4){
//                    System.out.println(num3);
//                }
//                else{
//                    System.out.println(num4);
//                }
//            }
//        }
//
//        int max = num1;
//        if(num2 > max){
//            max = num2;
//        }
//        if(num3 > max){
//            max = num3;
//        }
//        if(num4 > max){
//            max = num4;
//        }
//        System.out.println(max);


        // QUESTION 3.....
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
}
