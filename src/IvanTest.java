import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IvanTest {
    public static void main(String[] args) throws IOException {
     //   Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[3];
        int count = 0;
        int i = 0;
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        if (arr[0] > arr[1]) {
            count++;
        }

//        arr[2] = scanner.nextInt();

//
//
        if (arr[0] > arr[1]) {
            count++;
        }


        int m = 0;
        for (int j = 4; j < N; j++) {
            arr[m] = Integer.parseInt(reader.readLine());
            m++;
            if (m == 2) {
                if (arr[1] > arr[0] && arr[1] > arr[2]) {
                    count++;
                }
                m = 0;
            }

        }

        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());

        if (arr[1] > arr[0]) {
            count++;
        }

        System.out.println(count);


    }
}

