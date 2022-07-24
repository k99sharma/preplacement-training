package Week3.CountingBits;

class Solution {
    public int bits(int num){
        int count = 0;

        while(num != 0){
            if((num&1) == 1)
                count += 1;

            num = num>>1;
        }

        return count;
    }

    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i=0; i<n+1; i++){
            result[i] = bits(i);
        }

        return result;
    }
}