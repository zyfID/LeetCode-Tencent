class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double mid;
		if (nums1.length != 0 & nums2.length != 0) {
			int length = nums1.length + nums2.length;
			int nums[] = Arrays.copyOf(nums1, length);

			for(int i=0; i<nums2.length; i++){
				nums[nums1.length+i] = nums2[i];
			}
			Arrays.sort(nums);
			
			if (length%2 == 0) {
				int x = nums[length/2];
				int y = nums[length/2-1];
				mid = (double)(x + y) / 2;
			}else {
				mid = (double) nums[length/2];
			}
			
		}else if (nums1.length != 0 & nums2.length == 0) {
			Arrays.sort(nums1);
			int length = nums1.length;
			if (length%2 == 0) {
				int x = nums1[length/2];
				int y = nums1[length/2-1];
				mid = (double)(x + y) / 2;
			}else {
				mid = (double) nums1[length/2];
			}
			
		}else if (nums1.length == 0 & nums2.length != 0) {
			Arrays.sort(nums2);
			int length = nums2.length;
			if (length%2 == 0) {
				int x = nums2[length/2];
				int y = nums2[length/2-1];
				mid = (double)(x + y) / 2;
			}else {
				mid = (double) nums2[length/2];
			}
		}else {
			mid = 0;
		}
		
		return mid;
    }
}
