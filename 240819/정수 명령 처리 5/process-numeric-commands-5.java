import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            if (command.equals("push_back")) {
                int A = Integer.parseInt(st.nextToken());
                list.add(A);
            }
            else if (command.equals("pop_back")) {
                list.remove(list.size() - 1);
            }
            else if (command.equals("size")) {
                System.out.println(list.size());
            }
            else if (command.equals("get")) {
                int k = Integer.parseInt(st.nextToken());
                System.out.println(list.get(k - 1));
            }
        }
    }
}