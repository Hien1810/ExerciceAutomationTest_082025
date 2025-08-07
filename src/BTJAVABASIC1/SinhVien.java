package BTJAVABASIC1;

public class SinhVien {
    String name = "Nguyen Minh Hien";   // Khai báo biến instance
    static int age = 32; // Khai báo biến Static


    public static void main(String[] args) {
        int studentID = 23512; // Khai báo biến Local

        SinhVien sv = new SinhVien(); //tạo đối  tượng obj từ class Variable
        System.out.println("Tên:" + " " + sv.name); // Truy cập biến instance trong obj và in ra biến instance
        System.out.println("Tuổi:" + " "+ age ); // in ra biến Static
        System.out.println("Mã Số Sinh Viên:" + " "  + studentID); // in ra biến local

        System.out.println("Tên Trường:" + " " + ThongTin.schoolName); // in ra biến Static từ class ThongTin
        System.out.println("Mã Trường:" + " " + ThongTin.schoolID); // in ra biến Static từ class ThongTin
        System.out.println("Năm Học:" + " " + ThongTin.year); // in ra biến Static từ class ThongTin

    }
}
