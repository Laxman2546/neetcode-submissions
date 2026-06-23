class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int maxLen = 0;
        int count = 0;
        int start = 0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)||!hs.contains(nums[i]+1)){
                    start = nums[i];
                    count = 0;
                    while(hs.contains(start)){
                        count++;
                        maxLen = Math.max(maxLen,count);
                        start =start+1;
                    }
            }
        }
        return maxLen;
    }
}
