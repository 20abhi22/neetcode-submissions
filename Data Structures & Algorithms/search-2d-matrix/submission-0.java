class Solution {

    private boolean binarySearch(int i, int[][] a, int target, int n) {

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (a[i][mid] == target) {
                return true;
            }

            if (a[i][mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int i;

        for (i = 0; i < m; i++) {

            if (target >= matrix[i][0] &&
                target <= matrix[i][n - 1]) {

                break;
            }
        }

        if (i == m) {
            return false;
        }

        return binarySearch(i, matrix, target, n);
    }
}