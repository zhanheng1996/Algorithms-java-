package algorithms.lintcode;

import java.util.ArrayList;
import java.util.List;


public class lincode1652 {
    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    /**
     * @param A:
     * @param query:
     * @return: nothing
     */
    public List<Integer> intervalXOR(int[] A, List<Interval> query) {
        List<Integer> result = new ArrayList<>();
        int item;
        for (int i = 0; i < query.size(); i++) {
            item = 0;
            for (int j = query.get(i).start; j <= query.get(i).end + query.get(i).start - 1;j++) {
                item = item ^ A[j];
            }
            result.add(item);
        }
        return result;
    }
}
