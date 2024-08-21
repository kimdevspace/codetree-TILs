public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        recur1(7);
        System.out.println();
        recur2(7);
    }
    public static void recur1(int n) {
        if (n == 0) {
            return;
        }
        recur1(n - 1);
        System.out.print(n + " ");
    }
    public static void recur2(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        recur2(n - 1);
    }
}