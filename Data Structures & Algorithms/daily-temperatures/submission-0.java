class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];

        for(int i = 0; i< temperatures.length ; i++){
            int j = i;
            while( j < temperatures.length){
                if(temperatures[j] > temperatures[i]){
                    result[i] = j - i;
                    break;
                }
                j++;
            }

        }
        System.out.println(Arrays.toString(result));
        return result;










    //     int n = temperatures.length;
    //     int[] res = new int[n];
    //     int count = 0;

    //     if(temperatures.lenght == 1) return res;

    //     for (int i = 0 ; i < temperatures.length - 1; i++){
    //         int j = i + 1;
    //         while (j < temperatures.length){
                
    //             if( temperatures[i] < temperatures[j]){
    //                 res[i] = count;
    //             }
    //         }
    //     }
    }
}
