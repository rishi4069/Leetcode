class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        return true;

        long left=0;
        long right=num;
        while(left<right){
            long mid=(right+left)/2;
            System.out.println(mid);
            if(mid*mid==num){
                return true;
            }
            if(mid*mid>num){
                right=mid;
            }
            else{
                left=mid+1;
            }
            
        }
        return false;
    }
}