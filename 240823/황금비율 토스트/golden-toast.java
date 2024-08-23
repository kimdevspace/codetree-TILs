import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String bread = sc.next();
        LinkedList<Character> l = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            l.add(bread.charAt(i));
        }

        ListIterator<Character> it = l.listIterator(l.size());
        for (int i = 0; i < m; i++) {
            String command = sc.next();
            if (command.equals("L")) {
                if (it.hasPrevious()) {
                    it.previous();
                }
            }else if (command.equals("P")) {
                it.add(sc.next().charAt(0));
            }else if (command.equals("R")) {
                if (it.hasNext()) {
                    it.next();
                }
            }else if (command.equals("D")) {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }
        }
        for (char c : l) {
            System.out.print(c);
        }
    }
}