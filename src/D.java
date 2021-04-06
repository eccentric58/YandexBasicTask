import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int count = 0;
        int prev = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        int next = Integer.parseInt(tokenizer.nextToken());
        for (int i = 1; i < n; i++) {
            curr = next;
            next = Integer.parseInt(tokenizer.nextToken());
            if (prev < curr && curr > next) {
                count++;
            }
            prev = curr;
        }
        if (curr < next) {
            count++;
        }
        System.out.println(count);
    }
}