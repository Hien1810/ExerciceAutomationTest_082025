package BTJAVABASIC2;

public class Calculator {
    // Hàm tính tổng 2 số nguyên
    public int sumTwoIntegers(int a, int b){
        return a+b;
    }
    // Hàm tính tích 2 số thực
    public float multiplyTwoFloats(float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng Calculator
        Calculator calc  = new Calculator();

        // Gọi hàm tính tổng 2 số nguyên và in ra kết quả
        System.out.println("Kết quả tổng 2 số nguyên 1 và 9 là:" + " " + calc.sumTwoIntegers(1,9) );

        // Gọi hàm tính tích 2 số thực và in ra kết quả
        System.out.println("Kết quả tích 2 số thực 1.1 và 9.9 là:" + " " + calc.multiplyTwoFloats(1.2f,9.9f) );

    }
}
