package algorithms.lintcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HengZhan
 * @Description:
 * @Date: 2018/10/30
 */
public class MajorityElementII {
    /*
     * @param nums: a list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int size = nums.size() / 3;
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
