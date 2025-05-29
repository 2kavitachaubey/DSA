package RecursionSkillRiser;

public class PrintTable {
    static int table(int number,int times){
        if(times == 0){
            return number;
        }
        int count = table(number,times-1);
        System.out.println(number+ " * " + times + " = "+ count);
        return count + number;
    }

    static String table2(int number,int times){
        if(times == 0){
            return "";
        }
        String result = table2(number,times-1);
        String expression = number+ " * " + times + " = "+ (number*times)+"\n";
        return result + expression;
    }
//    table2(5, 3)
//       → result = table2(5, 2)
//       → result = table2(5, 1)
//       → result = table2(5, 0) → returns ""
//            → expression = "5 * 1 = 5\n"
//            → return "" + "5 * 1 = 5\n" → returns "5 * 1 = 5\n"
//            → expression = "5 * 2 = 10\n"
//            → return "5 * 1 = 5\n" + "5 * 2 = 10\n"
//            → expression = "5 * 3 = 15\n"
//            → return "5 * 1 = 5\n5 * 2 = 10\n5 * 3 = 15\n"


    static void table1(int number,int times){
        if(times == 0){
            return ;
        }
        table1(number,times-1);
        System.out.println(number+ " * " + times + " = "+ (number*times));
    }
    public static void main(String[] args) {
        table(5,10);
        System.out.println();
        table1(6,10);
        System.out.println();
        String r = table2(7,10);
        System.out.println(r);
    }
}
