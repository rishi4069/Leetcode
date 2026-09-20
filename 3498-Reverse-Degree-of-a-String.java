//------------On-the-fly computation--------- optimal approach
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=(26-(s.charAt(i)-'a'))*(i+1);
			sum+=x;        
        }
        return sum;
    }
}
//-------------Precomputation / Lookup Table
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int[] cha=new int[26];
        for(int i=0;i<26;i++){
            cha[i]=Math.abs(26-i);
        }
        for(int i=0;i<s.length();i++){
            int x=cha[s.charAt(i)-'a']*(i+1);
            sum+=x;        
        }
        return sum;
    }
}