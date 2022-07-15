package Week2.MedianOfTwoSortedArrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];

        int p = 0;
        int q = 0;
        int counter = 0;
        while(p < nums1.length && q < nums2.length){
            if(nums1[p] < nums2[q]){
                nums[counter++] = nums1[p];
                p++;
            }else if(nums1[p] > nums2[q]){
                nums[counter++] = nums2[q];
                q++;
            }else{
                nums[counter++] = nums[p];
                p++;
            }
        }

        while(p < nums1.length) nums[counter++] = nums1[p++];

        while(q < nums2.length) nums[counter++] = nums2[q++];

        System.out.println(Arrays.toString(nums));

        if(nums.length%2 == 1)
            return nums[nums.length/2];

        return (double) (nums[nums.length/2] + nums[(nums.length/2)-1])/2;
    }
}