
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StajirovkaYandex {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        boolean tmp = true;

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                tmp = false;
            }
        }

        if (tmp) {
            System.out.println(arr[arr.length - 1] - arr[0]);
        } else System.out.println("-1");


    }
}