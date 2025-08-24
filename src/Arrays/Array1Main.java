package Arrays;

public class Array1Main {
    public static void main(String[] args) {
        Array1_1Java a2 = new Array1_1Java(5);
        a2.insert(1, 2);
        a2.insert(0, 3);
        a2.insert(2, 7);
        a2.insert(3, 6);

        a2.insert(1, 5);
        a2.insert(11, 5);

        var firstValue = a2.array[0];
        System.out.println(firstValue);
        var thirdValue = a2.array[1];
        System.out.println(thirdValue);

        a2.traversalArray();
        a2.searchElement(4);
        a2.deleteElement(2);
        System.out.println(a2.array[3]);
    }
}
