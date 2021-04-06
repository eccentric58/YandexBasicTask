import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Meterologia {
    public static void main(String[] args) throws IOException {

        // Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        int tmp = 0;
        int m;

        for (int i = 0; i < N; i++) {
            m = Integer.parseInt(reader.readLine());
            arr[i] = m;
        }

        for (int i = 1; i < N - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                tmp++;
        }

        if (arr[0] > arr[1]) {
        tmp++;
    }

        if (arr[N - 1] > arr[N - 2]) {
        tmp++;
    }


        System.out.println(tmp);

}


}