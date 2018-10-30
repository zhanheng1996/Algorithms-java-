package algorithms.lintcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HengZhan
 * @Description:
 * @Date: 2018/10/30
 */
public class MajorityNumberIII {
    /**
     * @param nums: A list of integers
     * @param k: An integer
     * @return: The majority number
     */
    public int majorityNumber(List<Integer> nums, int k) {
        // write your code here
        int size = nums.size() / k;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer num : map.keySet()) {
            if (map.get(num) > size){
                return num;
            }
        }
        return 0;
    }
}
