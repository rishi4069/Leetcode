class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;

        long mid=0;
        while(low<=high)
        {
        mid=low+(high-low)/2;
        long val=mid*mid;
            if(val==x)
            {
                return (int)mid;
            }
            else if(val<x){
                low=(int)mid+1;
            }
            else{
                high=(int)mid-1;
            }
        }
        return high;
    }
}