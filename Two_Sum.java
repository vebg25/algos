class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if (hm.containsKey(b)) {
                arr[0] = i;
                arr[1] = hm.get(b);
            }
            hm.put(nums[i], i);
        }
        return arr;
    }
}