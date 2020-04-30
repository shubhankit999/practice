import java.util.Random;

public class MainOne {

    public static void main(String[] args) {
        int A[] = {3, 2, 6};
        int B[] = {4, 1, 6};

        if(A.length != B.length) {

        }

        int count =0;
        for(int i=0; i<A.length-1; i++) {
            if(findData(A, B, i,A.length)) {
                ++count;
            }
        }

        System.out.println(count);


    }

    private static boolean findData(int A[], int B[], int m, int n) {

        int sumOfLA = 0;

        int sumOfLB = 0;

        for(int i=0; i<=m; i++) {
            sumOfLA = sumOfLA + A[i];
            sumOfLB = sumOfLB + B[i];
        }

        if(sumOfLA != sumOfLB) {
            return false;
        }

        int sumOfRA = 0;

        int sumOfRB = 0;

        for(int i=m+1; i<n; i++) {
            sumOfRA = sumOfRA + A[i];
            sumOfRB = sumOfRB + B[i];
        }

        if(sumOfRA != sumOfRB) {
            return false;
        }

        if(sumOfRA==sumOfLA) {
            return true;
        }
        return false;


    }

    private static char randomN(char[] chars, int i, int n) {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        if(i==0) {
            if (c != chars[i + 1]) {
                return c;
            } else {
                return randomN(chars, i, n);
            }
        }

        else if(i == n-1) {
            if (c != chars[i - 1]) {
                return c;
            } else {
                return randomN(chars, i, n);
            }
        }


        else {
            if ((c != chars[i - 1]) && (c != chars[i + 1])) {
                return c;
            } else {
                return randomN(chars, i, n);
            }
        }

    }
}
