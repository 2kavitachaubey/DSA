package RecursionSkillRiser;

import java.util.Scanner;

public class PalindromeNumber {
    boolean palindrome2(int num,int sum,int n){
        if(num == 0){
            return sum == n;
        }
        sum = (sum * 10) + (num % 10);
        return palindrome2(num/10,sum,n);
    }

    void palindrome(int num,int sum,int n){
        if(num == 0){
            System.out.println(sum == n?"palindrome":"Not a Palindrome");
            return;
        }
        sum = (sum * 10) + (num % 10);
        palindrome(num/10,sum,n);
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        int number;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = s.nextInt();
        int n = number;
        int reversed = 0;
        while(n > 0){
            reversed = (reversed*10) + (n % 10);
            n /= 10;
        }
        System.out.println(reversed);
        if(reversed == number){
            System.out.println("pali");
        }
        else{
            System.out.println("not pali");
        }

        //Recursion
        boolean r = p.palindrome2(number,0,number);
        System.out.println(r);
        p.palindrome(number,0,number);
    }
}
