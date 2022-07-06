package Week1.ShuffleTheArray;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int index=0;
        int[] arr = new int[2*n];
        for(int i=0; i<n; i++){
            arr[index] = nums[i];
            arr[index+1] = nums[n+i];
            index += 2;
        }

        return arr;
    }
}