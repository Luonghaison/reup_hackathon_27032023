package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ParentRegistor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> parent = new LinkedList<>();

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // consume the newline character
                    System.out.print("Nhập tên phụ huynh: ");
                    String parentName = scanner.nextLine();
                    parent.offer(parentName);
                    System.out.println("Đã thêm " + parentName + " vào danh sách.");
                    break;

                case 2:
                    if (!parent.isEmpty()) {
                        String firstParent = parent.poll();
                        System.out.println("Phụ huynh đầu tiên trong danh sách là: " + firstParent);
                        System.out.println("Danh sách phụ huynh mới là: "+ parent);
                    } else {
                        System.out.println("Không có phụ huynh nào trong danh sách");
                    }
                    break;

                case 3:
                    System.out.println("Thoát khỏi chương trình");
                    System.exit(0);
                    break;

                default:
                    System.err.println("Lựa chọn sai.mời nhập lại");
                    break;
            }
        }
    }
}
