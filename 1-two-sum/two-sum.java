class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complimentaryNumbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complimentaryNumbers.containsKey(complement)) {
                int[] indices = { i, complimentaryNumbers.get(complement)};
                return indices;
            }
            complimentaryNumbers.put(nums[i], i);
        }
        return null;
    }
}