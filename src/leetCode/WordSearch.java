package leetCode;

public class WordSearch {
    public static boolean existed(char[][] board,String word){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length;j++){
                if(isFound(board,word,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    static int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    public static boolean isFound(char[][] board,String word,int row,int col){
        if(word.length() == 0){
            return true;
        }
        if(row < 0 || col < 0 || row >= board.length|| col>=board[0].length|| board[row][col]!= word.charAt(0)){
            return false;
        }
        System.out.println(board[row][col]);
        board[row][col] = '#';
        boolean isMatched = false;
        for(int i = 0 ; i< directions.length; i++){
            int nextRow = directions[i][0];
            int nextCol = directions[i][1];
            isMatched = isFound(board,word.substring(1),row+nextRow,col+nextCol);
            if(isMatched){
                break;
            }
        }
        board[row][col] = word.charAt(0);
        return isMatched;
    }
    public static void main(String[] args) {
        char[][] arr = {{'a','b','c','d'},{'c','d','g','g'},{'e','h','i','j'}};
        System.out.println(existed(arr,"abcggji"));
    }
}
