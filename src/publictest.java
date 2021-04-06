import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class publictest {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
        byte[] buff = new byte[10];
        int read = System.in.read(buff);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(new String(buff, 0, read-1));
        factorization(N);
    }


    //121901900
    public static void factorization(int N) {

        while (N % 2 == 0) {
            N /= 2;
            System.out.print(2);
            System.out.print(" ");
        }

        int i = 3;
        while (i * i <= N) {
            if (N % i == 0) {
                System.out.print(i);
                System.out.print(" ");

                N = N / i;
            } else
                i += 2;
        }
        //  System.out.println("проверка ===== " + N);
        System.out.println(N);
    }
}