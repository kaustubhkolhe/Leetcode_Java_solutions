class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i< nums.length; i++){
            int ref = target-nums[i];
            
            if(map.containsKey(ref)){
                return new int[] {map.get(ref), i};
                
            }
            map.put(nums[i], i);
        }
        
       throw new IllegalArgumentException("no number found"); 
    }
}