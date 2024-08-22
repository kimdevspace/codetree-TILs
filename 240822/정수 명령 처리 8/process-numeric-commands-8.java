import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String command = sc.next();

            if (command.equals("push_front")) {
                linkedList.addFirst(sc.nextInt());
            }else if (command.equals("push_back")) {
                linkedList.addLast(sc.nextInt());
            }else if (command.equals("pop_front")) {
                System.out.println(linkedList.pollFirst());
            }else if (command.equals("pop_back")) {
                System.out.println(linkedList.pollLast());
            }else if (command.equals("size")) {
                System.out.println(linkedList.size());
            }else if (command.equals("empty")) {
                if (linkedList.isEmpty()) {
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }else if (command.equals("front")) {
                System.out.println(linkedList.peekFirst());
            }else {
                System.out.println(linkedList.peekLast());
            }
        }
    }
}