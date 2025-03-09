package Arrays;

import java.util.*;
public class ArrayProject {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many days temperature? ");
        int numDays = console.nextInt();
        int sum = 0;
        // Array of temperature
        int[] temp = new int[numDays];

        for (int i = 0; i<numDays; i++){
            System.out.print("Day " + (i+1) + "'s high temperature: ");
            temp[i] = console.nextInt();
            sum += temp[i];
        }
        //Calculate the average of temperatures
        int average = sum / numDays;

        int above = 0;
        for (int i = 0; i<temp.length; i++){
            if(temp[i] > average){
                above++;
            }
        }

        System.out.println();
        System.out.println("Average Temp: " + average);
        System.out.print(above + " day's above Average.");
    }
}
