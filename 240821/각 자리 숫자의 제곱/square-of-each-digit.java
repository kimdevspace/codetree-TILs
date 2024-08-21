import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.println((int) positionSum(sc.nextInt()));
    }
    public static double positionSum(int n) {
        if (n < 10) {
            return n * n;
        }
        return positionSum(n / 10) + Math.pow((n % 10), 2);
    }
}