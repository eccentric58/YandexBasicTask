import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Yandex11111 {
    public static void main(String[] args) throws Exception {

        //Scanner scanner = new Scanner(new File("input.txt"));
        FileReader input = new FileReader("input.txt");

        int N = 0;
        int x;
        while ((x = input.read()) != '\n') {
            N = (x - '0') + 10 * N;
        }
        int[] arr = new int[N];
        int tmp = 0;
        int m;

        for (int i = 0; i < N; i++) {
            while ((x= input.read()) != ' '){
                arr[i] = (x - '0') + arr[i] *10;
            }
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