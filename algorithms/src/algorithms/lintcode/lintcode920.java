package algorithms.lintcode;

import java.util.List;

public class lintcode920 {

    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */

    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        if (intervals == null || intervals.size() == 0) {
            return true;
        }

        intervals.sort(((o1, o2) -> o1.start - o2.start));
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < end)
                return false;
            end = intervals.get(i).end;
        }
        return true;
    }
}
