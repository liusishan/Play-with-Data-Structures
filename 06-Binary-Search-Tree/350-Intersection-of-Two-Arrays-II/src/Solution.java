import java.util.ArrayList;
import java.util.TreeMap;

/**
 * @Auther: lss
 * @Date: 2019/2/20 14:57
 * @Description:
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums1) {
            if (!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0)
                    map.remove(num);
            }
        }

        int[] res = new int[list.size()];
        int i = 0;
//        for (int i = 0; i < list.size(); i++)
//            res[i] = list.get(i);
        for (Integer num : list) {
            res[i++] = num;
        }
        return res;
    }
}
