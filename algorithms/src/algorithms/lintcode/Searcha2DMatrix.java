package algorithms.lintcode;

public class Searcha2DMatrix {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int a = matrix.length;
        int b = matrix[0].length;
        int result, location;
        if (a % 2 == 0) {
            result = matrix[a / 2][0];
        } else {
            result = matrix[a / 2][b / 2];
        }
        int start = 0;
        int end = a * b - 1;
        location = (start + end) / 2 + 1;
        for (int i = 0; i < a * b && start <= end; i++) {
            if (target > result) {
                start = location + 1;
            } else if (target < result) {
                end = location - 1;
            } else {
                return true;
            }
            location = (start + end) / 2;
            result = matrix[location / b][location % b];
        }
        return false;
    }
}
