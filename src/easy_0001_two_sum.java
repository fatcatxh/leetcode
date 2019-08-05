import java.util.HashMap;

public class easy_0001_two_sum {

    public int[] twoSum(int nums[], int target) {
        HashMap<Integer, Integer> m1 = new HashMap();
        m1.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int diff = target - nums[i];
            if (m1.containsKey(diff)) {
                return new int[]{i, m1.get(diff)};
            }
            // 在判断之后再将值放进map，可以解决数组中有重复值的情况
            m1.put(nums[i], i);
        }

// 遍历得出答案
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (target == nums[i] + nums[j]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        easy_0001_two_sum solution = new easy_0001_two_sum();
        int[] nums = {1,2,3,3,5};
        int[] result = solution.twoSum(nums, 7);
        for (int i : result) {
            System.out.println(i);
        }

    }


}
