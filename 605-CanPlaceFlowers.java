class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length && n>0;i++)
        {
            if(flowerbed[i]==0)
            {
                int left= (i==0) ? 0 : flowerbed[i-1];
                int right= (i==flowerbed.length-1) ? 0 : flowerbed[i+1];
                //System.out.print(left+" "+right+" ");
                if(left==right && left==0){
                    n--;
                    flowerbed[i]=1;
                }
            }
           // System.out.println(flowerbed[i]);
        }
        return n==0;
    }
}