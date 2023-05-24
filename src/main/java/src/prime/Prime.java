package prime;

public class Prime {
    public static void main(String args[]) {
        int n1 = 29;
        int[] ints = makeArr(n1);

        boolean result1 = isPrime1(n1);
        boolean result2 = isPrime2(n1);

        int[] result3 = isPrime3(ints, n1);

        System.out.println(result1);
        System.out.println(result2);

        for (int i=0; i<result3.length; i++) {
            if (result3[i] != 0) {
                System.out.print(result3[i] + " ");
            }
        }
    }

    static boolean isPrime1 (int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrime2 (int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] isPrime3(int[] ints, int n) {
        for (int i = 2; i<=n; i++) {
            if (ints[i] == 0) continue;

            for (int j = i + i; j<=n; j += i) {
                ints[j] = 0;
            }
        }

        return ints;
    }

    static int[] makeArr(int n) {
        int[] arr = new int[n+1];

        for (int i=0; i<=n; i++) {
            arr[i] = i;
        }

        return arr;
    }
}
