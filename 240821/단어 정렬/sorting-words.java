import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strList = new String[n];
		for (int i = 0; i < n; i++) {
			strList[i] = sc.next();
		}
		
		Arrays.sort(strList);
		for (int i = 0; i < n; i++) {
			System.out.println(strList[i]);
		}
	}
}