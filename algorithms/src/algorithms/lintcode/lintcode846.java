package algorithms.lintcode;

public class lintcode846 {
    /**
     * @param array: the input array
     * @return: the sorted array
     */
    public int[][] multiSort(int[][] array) {
        // Write your code here
        if (array == null || array.length == 0)
            return array;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j][1] < array[j + 1][1]) {
                    int[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                if (array[j][1] == array[j + 1][1]) {
                    if (array[j][0] > array[j + 1][0]){
                        int[] temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }
}
