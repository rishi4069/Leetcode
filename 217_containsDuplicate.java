public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int prev=nums[0];
        for(int i=0;i<nums.length;i++){
            if(prev==nums[i])
            {
                count++;
            }
            else{
                count=1;
                prev=nums[i];
            }
            if(count==2){
                return true;
            }
        }
        return false;
    }
	
	//------------------------------
	//-------------------
		public boolean containsDuplicate(int[] nums) {		
		 Map<Integer,Integer> map=new HashMap<>();
    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)==2){
            return true;
        }
    }
    return false;
    }