package pro.sky.alghoritmsp2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        IntegerListImpl list = new IntegerListImpl();

        list.add(23);
        list.add(42);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);

        list.remove(1);

        list.quickSort(list.storage, 0, list.storage.length - 5);

        System.out.println(Arrays.toString(list.storage));
    }
}
