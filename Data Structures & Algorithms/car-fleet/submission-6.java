class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        Map<Integer,Float> timeToTargetMap = new HashMap<>();

        int distance;
        float timeToTarget;
        int numFleets = 1;

        for(int i = 0; i < position.length ; i++){
            
            distance = target - position[i];
            timeToTarget = (float) distance / speed[i];

            timeToTargetMap.put(position[i], timeToTarget);
        }
        
        Arrays.sort(position);

        for(int i = position.length - 1; i > 0 ; i--){
            if(timeToTargetMap.get(position[i-1]) > timeToTargetMap.get(position[i])){
                numFleets++;
            } else {
                timeToTargetMap.put(position[i-1], timeToTargetMap.get(position[i]));
            }
        }

        return numFleets;

        
    }
}