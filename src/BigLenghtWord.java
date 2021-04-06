/*import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BigLenghtWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int f;
        f = scanner.nextInt(); // не знаю, зачем вам данная переменная

        String a; //= scanner.nextLine();

        System.out.println(Word(a = scanner.nextLine()));
    }

    public static int Word(String a) {
        String[] arr = a.split(" ");

      /*  for (String s : arr) {
            System.out.println("Проверка ======" + s);
        }

        String max_word = arr[0];
        int count = arr[0].length();
        for (String s : arr) {
            if (count < s.length()) {
                count = s.length();
                max_word = s;
            }
        }
        System.out.println(max_word);
        return count;
    }
}
*/