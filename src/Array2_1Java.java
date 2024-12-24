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
                System.out.println("The value is successfully inserted.");
            }
            else{
                System.out.println("The index is already occupied.");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index is invalid.");
        }
    }
}
