package BTJAVABASIC3;

public class OperatorPractice {
    // Khai báo 3 biến bất kỳ
    int a = 10;
    int b = 20;
    int c = 30;

    // Biến cố định
    final int number = 100;

    // Hàm kiểm tra toán tử quan hệ và logic
    public void checkOperators() {
        // Quan hệ
        System.out.println("a > b: " + (a > b));
        System.out.println("b < c: " + (b < c));
        System.out.println("a == 10: " + (a == 10));

        // Logic
        System.out.println("(a < b) && (b < c): " + ((a < b) && (b < c)));
        System.out.println("(a > b) || (c > b): " + ((a > b) || (c > b)));
    }

    // Hàm kiểm tra n so với number
    public void compareWithNumber(int n) {
        if (n == number) {
            System.out.println("Giá trị n bằng 100");
        } else if (n < number) {
            System.out.println("Giá trị n nhỏ hơn 100");
        } else {
            System.out.println("Giá trị n lớn hơn 100");
        }
    }

    // Hàm main
    public static void main(String[] args) {
        OperatorPractice op = new OperatorPractice();

        // Gọi hàm kiểm tra toán tử
        System.out.println("=== Kết quả kiểm tra toán tử ===");
        op.checkOperators();

        // Gọi hàm if else với giá trị khác nhau
        System.out.println("\n=== Kết quả so sánh với number ===");
        op.compareWithNumber(100);   // TH1: bằng
        op.compareWithNumber(55);    // TH2: nhỏ hơn
        op.compareWithNumber(150);   // TH3: lớn hơn
    }
}
