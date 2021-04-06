import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeForces {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        String line = "";
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
            line += arr[i];
        }

        int lineToInt = Integer.parseInt(line);

        int K = Integer.parseInt(reader.readLine());

        lineToInt += K;

        int tmp = 0;
        int M = arr.length - 1;
        while (lineToInt > 0) {
            tmp = lineToInt % 10;
            arr[M] = tmp;
            lineToInt /= 10;
            if (M == 0) break;
            else
            M--;

         }

        for (int i = 0; i < N ; i++) {
            System.out.print(arr[i] + " ");

        }


    }
}
