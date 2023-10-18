public class Main {
    public static void main(String[] args) {
        System.out.println(s(-15, 10));
        System.out.println(s1(5, 20));
    }
    public static int s(int a, int b){
        if (a == 0 || b == 0) {
            return 0;
        }

        if (a == 1) {
            return b;
        }
        if (b == 1) {
            return a;
        }
        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
        a = Math.abs(a);
        b = Math.abs(b);

        int rez = 0;
        while (b > 0) {
            if ((b & 1) == 1) {
                rez += a;
            }
            b >>= 1;
            a <<= 1;
        }
        return isNegative ? -rez : rez;
    }
    public static int s1(double a, double b){
        return (int)(a/(1/b));
    }}
