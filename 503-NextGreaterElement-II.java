//-----------------brute force
class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n1=nums.length;
        int[] greater = new int[n1];
        for(int i=0;i<n1;i++){
            boolean found=false;
            int j=i+1;
                    while(j<n1){
                        if(nums[i]<nums[j]){
                            found=true;
                            greater[i]=nums[j];
                            break;
                        }
                        j++;
                    }
            for(int k=0;k<i && !found ;k++){
                        if(nums[i]<nums[k]){
                            found=true;
                            greater[i]=nums[k];
                            break;
                        }
                }
            if(!found){
                greater[i]=-1;
            }
            }

        return greater;
    }
}