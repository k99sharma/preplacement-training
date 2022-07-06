package Week1.KidsWithTheGreatestNumberOfCandies;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumber = findMax(candies);

        List<Boolean> result = new ArrayList<Boolean> ();

        for(int i=0; i<candies.length; i++){
            if((candies[i] + extraCandies) >= maxNumber)
                result.add(true);
            else
                result.add(false);

        }

        return result;
    }

    public int findMax(int[] nums){
        int max = nums[0];

        for(int i=1; i<nums.length; i++)
            if(nums[i] > max)
                max = nums[i];

        return max;

    }
}