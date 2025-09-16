package BTJAVABASIC4;
import java.util.Arrays;
public class NumbersArray {
    public static void main(String[] args) {
        // Tạo mảng có 25 phần để lưu số chẵn từ 0 đến 50
        int[] evenNumbers = new int[26];
        int index = 0;
        // Dùng vòng lặp for để tìm và nạp số chẵn vào mảng
        for(int i =0 ;i <= 50;i++){
            if(i%2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
                      }
        System.out.println("Các số chẵn từ 0 đến 50 là:");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }



}
