class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> indexArray = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int complement = target - nums[i];

            if (indexArray.containsKey(complement)){
                return new int[]{indexArray.get(complement), i};
            }

            indexArray.put(nums[i], i);


        }
        return new int[]{-1,-1}; // won't happen        
    }
}
