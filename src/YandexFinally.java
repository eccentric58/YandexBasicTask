

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class YandexFinally {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }
        int l = 0;
        int tmp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                tmp = i;
            } else if (list.get(i) != 0) {
                list.set(i, i - tmp);
                l++;
            }
        }
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == 0) {
                tmp = i;
            } else if (list.get(i) != 0) {
                if (Math.abs(tmp - i) <= list.get(i))
                    list.set(i,Math.abs(i - tmp));
            }
        }
        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
