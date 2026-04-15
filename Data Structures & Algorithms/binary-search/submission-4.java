class Solution {
    public int search(int[] nums, int target) {

        int half = nums.length / 2;
        int i = 0;

        if(nums.length == 1 && nums[0] == target) return 0;

        if(target < nums[half]){
            while( i < half){
                if(nums[i] == target) return i;
                i++;
            }
            System.out.println();
        } else{
            i = half;
            while( i < nums.length){
                if(nums[i] == target) return i;
                i++;
            }
        }
        return -1;
    }
}
