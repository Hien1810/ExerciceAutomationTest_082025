package BTJAVABASIC5;

import java.util.ArrayList;
import java.util.Iterator;

public class NumbersArray {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        // Thêm 50 số vào Arraylist
        for (int i = 0; i <= 50; i += 2) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        Iterator<Integer> iterator = evenNumbers.iterator();
        System.out.println("Các số chẵn từ 0 đến 50 là: ");
        while (iterator.hasNext()) {
            System.out.println((Integer) iterator.next());
        }

    }
}
