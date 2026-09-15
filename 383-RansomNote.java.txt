class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqNote=new int[26];
        //int[] freqMag=new int[26];
        for(char c:magazine.toCharArray())
        {
            freqNote[c-'a']++;
        }
        for(char c:ransomNote.toCharArray())
        {
            freqNote[c-'a']--;
        }
        

        for(int i=0;i<26;i++)
        {
            System.out.print("Note="+freqNote[i]+"");//+"mag="+freqMag[i]+"\n");
            if((freqNote[i]<0))
            return false;
        }
        return true;
    }
}