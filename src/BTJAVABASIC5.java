import java.util.*;

public class BTJAVABASIC5 {
    public static void main(String[] args) {

        // new TreeSet() sẽ sắp xếp các phần tử
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");
        System.out.println("So sánh giá trị Các phần tử của Set");
        System.out.println(hashSet.contains("Java"));
        System.out.println("Xóa phần tử của Set");
        hashSet.remove("Python");
        System.out.println("In ra số lượng phần tử còn lại sau khi xóa");
        System.out.println(hashSet.size());
        // Show set through Iterator
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show set through for-each
        System.out.println();
        for (String obj : hashSet) {
            System.out.println(obj + ", ");
        }
        ArrayList<String> list = new ArrayList<String>();
        // thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Csharp");
        list.add("Csharp");
        list.add("PHP");
        // sử dụng vòng lặp for cải tiến - hiển thị các phần tử của list
        Iterator<String> iterator = list.iterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
        System.out.println("Các phần tử có trong list là: ");
        for (String str : list) {
            System.out.println(str);
        }
        list.remove("Csharp");
        System.out.println(list);
    }
}
