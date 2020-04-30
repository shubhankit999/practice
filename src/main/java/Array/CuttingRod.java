package Array;

public class CuttingRod {

    public static void main(String[] args) {
        int ar[] = {1, 5, 8, 9, 10, 17, 17, 20};

        int cutRod[] = new int[9];

        cutRod[0] = 0;
        for (int i = 1; i<=8; i++) {

            int max = 0;

            for (int j = 0; j < i; j++) {

                if (max < (ar[j] + cutRod[i - j - 1])) {
                    max = ar[j] + cutRod[i - j - 1];
                }
            }

            cutRod[i] = max;
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(cutRod[i]);
        }

    }


    int cutRod(int price[], int n) {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;

        // Recursively cut the rod in different pieces and compare different
        // configurations
        for (int i = 0; i < n; i++)
            max_val = Integer.max(max_val, price[i] + cutRod(price, n - i - 1));

        return max_val;
    }
}
