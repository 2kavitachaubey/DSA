import java.util.*;

public class ArrayListJava {
    public static void main(String [] args){

        //Creation of ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30,40,50,60));
        ArrayList<String> items = new ArrayList<>();

        //Insertion in ArrayList
        items.add("Apples");
        items.add("Banana");
        items.add("Oranges");
        items.add(2,"Mango");

        //Accessing ArrayList element
        System.out.println(items.get(2));

        //Traversal ArrayList
        for(int i = 0; i<items.size(); i++){
            String item = items.get(i);
            System.out.println(item);
        }

        for(Integer n: numbers){
            System.out.println(n);
        }

        Iterator<String> letters = items.iterator();
        while (letters.hasNext()){
            String item = letters.next();
            System.out.println(item);
        }

        //Searching elements
        for(Integer num: numbers){
            if(num.equals(40)){
                System.out.println("Found the number...");
                break;
            }
        }

        int index = items.indexOf("Oranges");
        System.out.println("The index of item is: " + index);

        //Remove Elements
        System.out.println(items);
        System.out.println(numbers);

        items.remove("Mango");
        System.out.println(items);

        numbers.remove(3);
        System.out.println(numbers);

        //Sorting in Array....
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(Arrays.asList(4,2,65,24,75,24));
        System.out.println(myNumbers);

        Collections.sort(myNumbers);
        System.out.println(myNumbers);

    }
}
