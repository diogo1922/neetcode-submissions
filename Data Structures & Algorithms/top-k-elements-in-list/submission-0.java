class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> countFrequency = new HashMap<>();

        // Put to the HashMap the key as the element/number in the array and 
        // the value as the frequency of occurrence. 
        // Example: nums =[1,2,2,3,3,3] countFrequency {1=1, 2=2, 3=3}
        // .getOrDefault() method adds the value to the key if the value does not exist, 
        // otherwise it returns the number 0. 
        for( int num : nums){
            countFrequency.put(num, countFrequency.getOrDefault(num,0) + 1);
        }

        List<int[]> arr = new ArrayList<>();

        // Here we are adding to the ArrayList arr the arrays with value and the key of 
        // each element in the HashMap. Example: arr = {[value, key], [value, key], etc.} 
        for(Map.Entry<Integer,Integer> entry : countFrequency.entrySet()){
            arr.add(new int[] {entry.getKey(), entry.getValue()});
        }

        // Here the parameter requires an object of type comparator (interface)
        // This is comparing the first element of the second array (b[0]) 
        // with the first element of the first array (a[0])
        // If the result is positive - the sorting will be descending
        // if the result is negative - the sorting will be ascencing
        // if the result is zero - they are equal and therefore no sorting needed. 
        arr.sort((a,b) -> b[1] - a[1]);

        // Now the ArrayList arr is sorted in descending order
        // so the first element of the arraylist is higher than the remaining.

        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = arr.get(i)[0];
        }
        return res;
    }
}
