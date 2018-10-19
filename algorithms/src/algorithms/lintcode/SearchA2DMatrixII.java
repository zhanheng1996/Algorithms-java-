package algorithms.lintcode;

/**
 * @Author: HengZhan
 * @Description:
 * @Date: 2018/10/19
 */
public class SearchA2DMatrixII {
    /**
     * @param matrix: A list of lists of integers
     * @param target: An integer you want to search in matrix
     * @return: An integer indicate the total occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        int result = 0;
        for (int[] row : matrix) {
            if (row[0] > target)
                break;
            for (int n : row) {
                if (n > target)
                    break;
                if (n == target)
                    result++;
            }
        }
        return result;
    }
}
