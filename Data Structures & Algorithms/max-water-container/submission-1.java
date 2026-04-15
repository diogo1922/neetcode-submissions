class Solution {
    public int maxArea(int[] heights) {

        int l = 0, r = heights.length - 1, i=0;
        int maxL = 0, maxR = 0;
        int maxWater = 0, tempMaxWater = 0;

        while( l < r){

            if( heights[l] <= heights[r]){
                tempMaxWater = heights[l] * ( r - l);
            }

             if( heights[r] <= heights[l]){
                tempMaxWater = heights[r] * ( r - l);
            }

            if(tempMaxWater > maxWater){
                maxWater = tempMaxWater;
            }

            l++;

            if(l == r){
                l=0;
                r--;
            }
            
        }

      return maxWater;
        
    }
}
