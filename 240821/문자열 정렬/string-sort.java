import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//문자열을 문자를 원소로 갖는 char배열로 변환한다.
		//Arrays.sort() 함수를 이용해 정렬한다.
		//정렬 이후에 다시 배열을 new String을 이용해 문자열로 만들어준다.
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sortedStr = new String(chars);
		System.out.println(sortedStr);
	}
}