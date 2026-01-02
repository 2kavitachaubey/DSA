package Arrays;

public class Array2_1Java {
    int arr[][] = null;
    public Array2_1Java(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int i=0; i<arr.length; i++){       //arr.length represent number of rows
            for(int j=0; j<arr[0].length ; j++){ //arr[0].length represent number of columns
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    public void insert(int row, int column, int value){
        try {
            if(arr[row][column] == Integer.MIN_VALUE){
                arr[row][column] = value;
                System.out.println("The value is successfully inserted..");
            }
            else{
                System.out.println("The index is already occupied.");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index is invalid...");
        }
    }

    public void access(int row, int column){
        System.out.println("Accessing row:" + row + " col:" + column);
        try{
            System.out.println("Cell value is: " + arr[row][column]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2 dimensional array.");
        }
    }

    public void traverse(){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void search(int value){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                if(arr[row][col] == value){
                    System.out.println("The value " + value + " is found at row: " + row + " column: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found.");
    }

    public void deleteValue(int row, int col){
        try{
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index is not valued for array.");
        }
    }
}
