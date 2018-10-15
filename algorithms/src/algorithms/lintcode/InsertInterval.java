package algorithms.lintcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    /**
     * @param intervals:   Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        List<Interval> result = new ArrayList<>();
        int index = 0;
        for (Interval interval : intervals) {
            if (newInterval.end < interval.start) {
                result.add(interval);
            } else if (newInterval.start > interval.end) {
                result.add(interval);
                index++;
            } else {
                newInterval.start = Math.min(newInterval.start, interval.start);
                newInterval.end = Math.max(newInterval.end, interval.end);
            }
        }
        result.add(index, newInterval);
        return result;
    }

    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

}
