class Solution {
    public int[] findErrorNums(int[] nums) {
       
        // int dup=0;
        // for(int i =0;i<nums.length;i++){
        //     dup=dup^nums[i];
        //     System.out.print(dup);
        //     dup=dup^i+1;
        //     System.out.println(" "+dup);
        // }
        // return new int[]{dup,1};
        Set<Integer> s=new HashSet<>();
        int sum=0;
        for(int num:nums){
            s.add(num);
            sum+=num;
        }
            int setSum=s.stream().mapToInt(Integer::intValue).sum();
        return new int[]{sum-setSum,((nums.length*(nums.length+1))/2)-setSum};
    }
}