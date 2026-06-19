
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            if (!firstOccurrence.containsKey(nums[i])) {
                firstOccurrence.put(nums[i], i);
            }
        }
        
        List<Integer> ls = new ArrayList<>(hm.keySet());
        
       ls.sort((a, b) -> {
            int freqA = hm.get(a);
            int freqB = hm.get(b);
            
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA); 
            }
            return Integer.compare(firstOccurrence.get(a), firstOccurrence.get(b));
        });
        
        int[] arr = new int[k];
        for (int m = 0; m < k; m++) {
            arr[m] = ls.get(m);
        }
        
        return arr;
    }
}
