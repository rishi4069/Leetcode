class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int column=mat[0].length;
        int row=mat.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<column;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            mp.put(i,count);
        }
        return mp.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}