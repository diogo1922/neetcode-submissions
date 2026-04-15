class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        Stack<Integer> stack = new Stack<>();

        int[][] arr = new int[position.length][2];
        
        for(int i = 0; i< position.length; i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        // Here we are sorting the array of arrays in descending order, from the first element
        Arrays.sort(arr, (a,b) -> Integer.compare(b[0],a[0]));

        double prev = 0;
        int count = 0;

        for(int i=0; i < position.length; i++){
            double time = (double) (target-arr[i][0])/arr[i][1];

            if(time>prev){
                count++;
                prev = time;
            }
        }

        return count;





        // Map<Integer,Float> timeToTargetMap = new HashMap<>();

        // int distance;
        // float timeToTarget;
        // int numFleets = 1;

        // for(int i = 0; i < position.length ; i++){
            
        //     distance = target - position[i];
        //     timeToTarget = (float) distance / speed[i];

        //     timeToTargetMap.put(position[i], timeToTarget);
        // }
        
        // Arrays.sort(position);

        // for(int i = position.length - 1; i > 0 ; i--){
        //     if(timeToTargetMap.get(position[i-1]) > timeToTargetMap.get(position[i])){
        //         numFleets++;
        //     } else {
        //         timeToTargetMap.put(position[i-1], timeToTargetMap.get(position[i]));
        //     }
        // }

        // return numFleets;

        
    }
}