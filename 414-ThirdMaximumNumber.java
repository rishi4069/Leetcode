class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s=new TreeSet<>(Collections.reverseOrder());
        for(int num:nums){
            s.add(num);
        }
        return s.size()>=3 ? s.stream().skip(2).findFirst().get():s.first();
    }
}


//--------------
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s=new TreeSet<>(Collections.reverseOrder());
        for(int num:nums){
            s.add(num);
        }
        return s.stream().skip(2).findFirst().orElse(s.stream().findFirst().get());

    }
}


//time complexity O(nlogn) since it is using set