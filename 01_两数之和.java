class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
		int[] newNum = new int[2];
		for(int i=0; i<length; i++){
			for(int j=i+1; j<length; j++){
				if (nums[i]+nums[j] == target) {
					newNum[0] = i;
					newNum[1] = j;
				}
			}
		}
		return newNum;
        
    }

}
