class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int num:nums1){
            for(int i=0;i<nums2.length;i++)
            {
                if(num==nums2[i])
                {
                    result.add(num);
                    nums2[i]=-1;
                    break;
                }

            }
        }
        return result.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}