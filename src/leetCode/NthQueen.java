package leetCode;

public class NthQueen {
    public static int queen(int n){
        boolean[][] board = new boolean[n][n];
        return helper(0,n,board);
    }
    public static boolean placeQueen(int row,int col,boolean[][] board,int n){
        for(int i =row;i>=0;i--){   // row k upar check karega
            if(board[i][col]){
                return false;
            }
        }
        for(int i = row,j = col; i>=0 && j>=0; i-- , j--){
            if(board[i][j]){
                return false;
            }
        }
        for(int i = row,j = col; i>=0 && j<n; i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    public static int helper(int row,int n,boolean[][] board){
        if(row == n){
            return 1;
        }
        int count = 0;
        for(int col = 0; col<n;col++){
            if(placeQueen(row,col,board,n)){
                board[row][col] = true;
                count += helper(row+1,n,board);
                board[row][col] = false;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(queen(5));
    }
}
