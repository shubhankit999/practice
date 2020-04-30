package Array;

public class HighestNumberOf1 {

    public static void main(String[] args) {

        int[][] ar = {{0,0,1,1},{0,1,1,1}, {0,0,0,1}, {0,0,0,0}};

        int rowWithHighestNumberOf1 = 0;
        int indexOfFirstOne = findIndexOFFirstOne(ar[0], 0, 3);

        //System.out.println(findIndexOFFirstOne(ar[3], 0, 3));
        for(int i=1; i<4; i++) {

            if(indexOfFirstOne > findIndexOFFirstOne(ar[i], 0, 3)) {
                rowWithHighestNumberOf1 = i;
            }

        }

        System.out.println("Row with highest number of 1 = " + rowWithHighestNumberOf1);
    }

    private static int findIndexOFFirstOne(int[] ar, int r, int c) {

        if(ar[c] == 0) {
            return Integer.MAX_VALUE;
        }
        int mid = (r+c) / 2;
        if(ar[mid] ==1 && ar[mid-1]==0) {
            return mid;
        } else if(ar[mid]==0) {
            return findIndexOFFirstOne(ar, mid+1, c);
        } else {
            return findIndexOFFirstOne(ar, r, mid-1);
        }

    }
}
