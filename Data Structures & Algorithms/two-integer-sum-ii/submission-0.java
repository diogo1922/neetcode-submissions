class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> indexMap = new HashMap<>();

        for( int i = 0; i < numbers.length; i++){
            int temp = target - numbers[i];
            if( indexMap.containsKey(temp)){
                return new int[] { indexMap.get(temp), i+1};
            }
            indexMap.put(numbers[i], i+1);
        }
        return new int[0];
        
    }
}
