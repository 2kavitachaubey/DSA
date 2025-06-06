package leetCode;

public class LongestPrefix {
    public static void main(String[] args) {
        String [] arr = {"Hello","Hey","Hell"};
        String newString = "";
        for(int i = 0;i<arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[0].charAt(i) != arr[j].charAt(i)) {
                    System.out.println(" ");
                }
//                if(newString)
//                newString += arr[0].charAt(i);
            }

        }
    }
}
