package algorithms.lintcode;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 * <p>
 * // @return true if this NestedInteger holds a single integer,
 * // rather than a nested list.
 * public boolean isInteger();
 * <p>
 * // @return the single integer that this NestedInteger holds,
 * // if it holds a single integer
 * // Return null if this NestedInteger holds a nested list
 * public Integer getInteger();
 * <p>
 * // @return the nested list that this NestedInteger holds,
 * // if it holds a nested list
 * // Return null if this NestedInteger holds a single integer
 * public List<NestedInteger> getList();
 * }
 */
//public class FlattenList {
//    // @param nestedList a list of NestedInteger
//    // @return a list of integer
//    public List<Integer> flatten(List<NestedInteger> nestedList) {
//        // Write your code here
//        ArrayList<Integer> result = new ArrayList<>();
//        for (NestedInteger ni : nestedList) {
//            if (ni.isInteger()) {
//                result.add(ni.getInteger());
//            } else {
//                result.addAll(flatten(ni.getList()));
//            }
//        }
//        return result;
//    }
//}
