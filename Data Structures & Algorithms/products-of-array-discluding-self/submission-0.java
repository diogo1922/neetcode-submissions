class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = Arrays.copyOf(nums, nums.length);
        for(int i = 0; i< result.length ; i++){
            result[i] = 1;
        }
        
        int i = 0;
        int j = 0;
        


        while ( j < result.length){
            if( i < nums.length && i!=j){
                result[j] *= nums[i];
            }
            i++;
            if (i>= nums.length){
                i = 0;
                j++;
            }
        }
        return result;


        
    }
}  
