class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int n = 0;
        int count = 1;
        int longestSeq = count;

        if(nums.length == 0) return count=0;


        for(int i = 1 ; i < nums.length ; i++){
            n = i - 1;
            if (nums[i] == nums[n] + 1  ){
                count++;
            } else if ( nums[i] == nums[n]){
                continue;
            } else {
                count = 1;
            }

            if (longestSeq < count) longestSeq = count;
        
        }
        return longestSeq;
    }
}
