package algorithms.java;

public class SearchInTwoDimensionalArrays {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int a = 0, b = array[0].length - 1;
        while (b >= 0 && a < array.length) {
            if (array[a][b] == target)
                return true;
            if (array[a][b] > target) {
                b--;
                continue;
            }
            if (array[a][b] < target) {
                a++;
                continue;
            }
        }
        return false;
    }
}
