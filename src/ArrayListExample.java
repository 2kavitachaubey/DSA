import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayListExample {
    static void getInformation(int sapId){
        ArrayList<String> studentName = new ArrayList<>(Arrays.asList("Kavita", "Muskan", "Chavi","Pansy"));
        studentName.add("Yogita");
        studentName.add(2,"Neha");

        ArrayList<Integer> studentId = new ArrayList<>(Arrays.asList(123,124,125,126,146,127));

        for(int i = 0 ; i<studentName.size(); i++) {
            for (int j = 0 ; j<studentId.size(); j++) {
                if (studentId.get(j) == sapId) {
                    System.out.println("Name : " + studentName.get(j));
                    System.out.println("Student Id : " + studentId.get(j));
                    return;
                }
            }
        }
    }
    static void removeInformation(int sapId){
        ArrayList<String> studentName = new ArrayList<>(Arrays.asList("Kavita", "Muskan", "Chavi","Pansy"));
        studentName.add("Yogita");
        studentName.add(2,"Neha");

        ArrayList<Integer> studentId = new ArrayList<>(Arrays.asList(123,124,125,126,146,127));

        HashMap<Integer,String> studentInfo = new HashMap<>();
        for(int i = 0 ; i<studentId.size(); i++){
            studentInfo.put(studentId.get(i),studentName.get(i));
        }
        System.out.println(studentInfo);


        for(int i = 0 ; i<studentName.size(); i++) {
            for (int j = 0 ; j<studentId.size(); j++) {
                if (studentId.get(j) == sapId) {
                    System.out.println("Name : " + studentName.remove(j));
                    System.out.println("Student Id : " + studentId.remove(j));
                    System.out.println(studentName);
                    System.out.println(studentId);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayListExample.getInformation(123);
        ArrayListExample.removeInformation(125);
    }
}
