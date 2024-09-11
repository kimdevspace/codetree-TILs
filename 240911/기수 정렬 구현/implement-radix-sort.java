import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxLength = 0;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            maxLength = Math.max(maxLength, isLength(arr[i]));
        }

        radixSort(arr, maxLength);

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int isLength(int num) {

        String str = num + "";
        return str.length();
    }

    private static void radixSort(int[] arr, int k) {

        int N = arr.length;
        Queue<Integer>[] bucket = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            bucket[i] = new LinkedList<>();
        }

        int factor = 1;
        for (int d = 0; d < k; d++) {
            for (int i = 0; i < N; i++) {
                bucket[(arr[i] / factor) % 10].add(arr[i]);
            }
            for (int i = 0, j = 0; i < 10; i++) {
                while (!bucket[i].isEmpty()) {
                    arr[j++] = bucket[i].poll();
                }
            }
            factor *= 10;
        }

    }

}