/*import java.util.Scanner;

public class translateTo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
       perevod(N);
    }


    public static void perevod(int N) {

        String str = "";
        int tmp;
        while (N > 0) {
            tmp = N % 2;
            // System.out.println("Проверка ===== tmp ====" + tmp);
            str += tmp;
            // System.out.println("Проверка ===== str ==== " + str);
            N = (int) N / 2;
            // System.out.println("Проверка ===== N ======" + N);
        }

        char[] str_reverse = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {
            str_reverse[i] = str.toCharArray()[str.length() - i - 1];
            System.out.print(str_reverse[i]);
        }


     //   return "forReturn";
    }
}
*/