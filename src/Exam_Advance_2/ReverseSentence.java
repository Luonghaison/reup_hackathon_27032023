package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Nhập câu: ");
                    String sentence = scanner.nextLine();
                    String[] words = sentence.split(" ");
                    for (String word : words) {
                        stack.push(word);
                    }
                    break;

                case 2:
                    System.out.print("Đảo ngược câu: ");
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop() + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Thoát khỏi chương trình");
                    System.exit(0);
                    break;

                default:
                    System.err.println("Nhập sai rồi,nhập lại đi");
                    break;
            }
        }
    }

}
