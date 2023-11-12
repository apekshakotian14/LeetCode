class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = matrix[0][0], high = matrix[m-1][n-1];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 0;
            for (int i = 0; i < m; i++) {
                count += rank(matrix[i], mid);
            }

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int rank(int[] row, int target) {
        int low = 0, high = row.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
