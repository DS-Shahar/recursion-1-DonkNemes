import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number for the first cumulative calculation");
        System.out.println(inception1(reader.nextInt()));
        System.out.println("Please enter a number for the second factorial calculation");
        System.out.println(inception2(reader.nextInt()));
        System.out.println("Please enter a number for the third multiplicating calculation");
        System.out.println(inception3(reader.nextInt()));
        System.out.println("Please enter a number for the fourth counting recursion?");
        System.out.println(inception4(reader.nextInt()));
        System.out.println("Please enter a number for the fifth recursion?");
        System.out.println(inception5(reader.nextInt(), reader.nextInt()));
        System.out.println("Please enter a number for the sixth recursion?");
        System.out.println(inception6(reader.nextInt(), reader.nextInt()));
        System.out.println("Please enter a number for the seventh recursion?");
        System.out.println(inception7(reader.nextInt(), reader.nextInt()));
        System.out.println("Please enter a number for the eighth recursion?");
        System.out.println(inception8(reader.nextInt()));
        System.out.println("Please enter a number for the ninth recursion?");
        System.out.println(inception9(reader.nextInt()));
        reader.close();
    }

    static int inception1(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return n + (inception1(n - 1));
    }

    static int inception2(int n) {
        if (n == 0)
            return 1;
        return n * (inception2(n - 1));
    }

    static int inception3(int n) {
        if (n <= 1)
            return 1;
        if (n % 2 != 0)
            return n * inception3(n - 2);
        return inception3(n - 1);
    }

    static int inception4(int n) {
        if (n == 0)
            return 0;
        return 1 + (inception4(n / 10));
    }

    static int inception5(int n1, int n2) {
        if (n2 == 0)
            return -1; // infinite number
        if (n1 < n2)
            return 0;
        return 1 + inception5(n1 - n2, n2);
    }

    static int inception6(int n1, int n2) {
        if (n2 == 0)
            return -1; // infinite number
        if (n1 < n2)
            return n1;
        return inception6(n1 - n2, n2);
    }

    static boolean inception7(int x, int y) {
        if (x - y < 0)
            return false;
        if (x - y == 0)
            return true;
        return inception7(x - y, y);
    }

    static boolean inception8(int x) {
        if (x <= 1)
            return false;
        for (int divisor = 2; divisor * divisor <= x; divisor++) {
            if (x % divisor == 0)
                return false;
        }
        return true;
    }

    static boolean inception9(int n) {
        n = Math.abs(n);
        if (n == 0)
            return true;

        int lastdig = n % 10;
        boolean even = lastdig % 2 == 0;

        return (lastdig == 0 || lastdig == 1 || lastdig == 3 || lastdig == 5 || lastdig == 7 || lastdig == 9) == !even
                && inception9(n / 10);
    }

}