class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        /*
            Logic:- 
            Create an Map which contains key as value of the array and index as value as we are looking for
            the indexes of two number, which can add upto target.
        */
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        // for loop to traverse over array. 
        for(int i = 0; i < nums.length; i++) {
            int lookingFor = target - nums[i];
            if(map.containsKey(lookingFor)) {
                return new int[] {map.get(lookingFor),i};
            }
            map.put(nums[i],i);
        }
        
        throw new IllegalArgumentException("No two sum solution");      
    }
}

