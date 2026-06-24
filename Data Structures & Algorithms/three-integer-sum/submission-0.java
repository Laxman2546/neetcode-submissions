class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0)return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int totalSum = nums[left] + nums[right] + nums[i];
                if(totalSum == 0){
                   res.add(List.of(nums[left], nums[right], nums[i]));
                while(left < right && nums[left] == nums[left+1])left++;
                while(left < right && nums[right] == nums[right-1])right--;
                left++;
                right--;
                }else if(totalSum  < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}
