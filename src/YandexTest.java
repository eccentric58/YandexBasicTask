import org.w3c.dom.ls.LSOutput;
/*
import java.io.IOException;
import java.util.Scanner;

public class YandexTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(palindrome(a));
    }

    public static String palindrome(String a) {
        String new_a = a.replaceAll("\\W", "").toLowerCase();
       /* new_a = a.replace(";", "");
        new_a = a.replace("-", "");
        new_a = a.replace(".", "");
        new_a = a.replace(":", "");
        new_a = a.replace("+", "");
        new_a = a.replace("_", "");



        String old_a = new_a;
      //  System.out.println("Proverka ======== " + old_a);
        char[] arrNew_a = old_a.toCharArray();
        char[] arrOld_a = old_a.toCharArray();

        //  System.out.println("");

        int y = 0;
        for (int i = old_a.length() - 1; i >= 0; i--) {
            arrNew_a[y] = arrOld_a[i];
            y++;
        }

     //   System.out.println(arrNew_a);
     //   System.out.println(arrOld_a);
        int count = 0;


        //   System.out.println("Проверка ======" + arrNew_a[old_a.length() - 2]);
        // System.out.println("Проверка ======" + arrOld_a[1]);

        for (int i = 0; i < old_a.length(); i++) {
            if (arrNew_a[i] == arrOld_a[i]) count++;
        //    System.out.println("Проверка ====== " + arrNew_a[i]);
        //    System.out.println("Проверка ====== " + arrOld_a[i]);
        }
        if (count == old_a.length()) return "True";
        else return "False";
    }


}

   String copy_a = a;
        char[] arr_copy = copy_a.toCharArray();
        char[] arr = a.toCharArray();
        boolean plus;
        for (int i = 0; i < a.length(); i++) {
            if (arr[i] == copy_a[a.length() - i]) {
                plus = true;
            } else plus = false;
        }
        if (plus = true) return "True";
        else return "False";


        */