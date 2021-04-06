import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

public class Perevod2to10 {

    public static final BigInteger TWO = new BigInteger("2");

    public static void main(String[] args) throws IOException {
//        byte[] a = new byte[1250];
//        byte[] b = new byte[1250];



        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String binString = reader.readLine();
        //String binString2 = reader.readLine();
        // BigInteger A = BigInteger.parseBigInteger(reader.readLine());
        //  Long B = Long.parseLong(binString2, 2);
        Scanner scanner = new Scanner(System.in);
        BigInteger perevod1 = scanner.nextBigInteger(2);
        BigInteger perevod2 = scanner.nextBigInteger(2);
        BigInteger sum_ = perevod1.add(perevod2);
        if (sum_.equals(BigInteger.ZERO)) {
            System.out.println("0");
        } else {
            perevod(sum_);
            // System.out.println(perevod1.toByteArray().length);

            // System.out.println();

        }
    }

   /* public static int perevod2to10C(BigInteger N) {
        BigInteger tmp;
        int i = 0;
        int sum = 0;
        while (N.compareTo(BigInteger.valueOf(0)) > 0) {
            tmp = N % 10;
            //   System.out.println("ПРОВЕРКА ===== TMP ======" + tmp);
            sum += tmp * Math.pow(2, i);
            //  System.out.println("ПРОВЕРКА ===== sum ======" + sum);
            N = N / 10;
            //  System.out.println("ПРОВЕРКА ===== N ======" + N);
            i++;
            //  System.out.println("ПРОВЕРКА ===== i ======" + i);
        }
        // System.out.println(sum);
        return sum;
    }

    */

//  public static BigInteger sum(BigInteger a, BigInteger b) {
//        BigInteger sum_;
//        return sum_ = a.add(b);
//    }

    public static void perevod(BigInteger sum) {
        boolean f = false;
        StringBuilder sb = new StringBuilder();
        for (int i = sum.bitLength(); i >= 0; i--) {
            if (sum.testBit(i)) {
                sb.append('1');
                f = true;
            } else if (f) {
                sb.append('0');
            }
        }

        System.out.println(sb.toString());
    }
}

