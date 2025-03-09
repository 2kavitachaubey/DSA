package Arrays;

public class Array1_1Java {
    int array[] = null;
    public Array1_1Java(int size){
        array = new int[size];
        for(int i = 0; i<array.length ;i++){
            array[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int value){
        try{
            if(array[location] == Integer.MIN_VALUE){
                array[location] = value;
                System.out.println("Successfully inserted the value...");
            }
            else{
                System.out.println("It's Already Full...");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index...");
//            e.printStackTrace();
        }
    }

    public void traversalArray(){
        try{
            for(int i=0;i<array.length; i++){
                System.out.print(array[i] + " ");
            }
        } catch(Exception e){
            System.out.println("Array is no longer exists...");
        }
    }

    public void searchElement(int searchValue){
        for(int i= 0; i<array.length;i++){
            if(array[i] == searchValue){
                System.out.println("Value is found in the index of " + i);
                return;
            }
        }
        System.out.println("Value is not found in array...");
    }

    public void deleteElement(int valueToDeleteIndex){
        try{
            array[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully...");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array.");
        }
    }
}
