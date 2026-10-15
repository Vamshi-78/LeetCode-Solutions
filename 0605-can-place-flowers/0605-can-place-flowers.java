class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size=flowerbed.length;
        int c=0;
        for(int i=0;i<size;i++){
            if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==size-1||flowerbed[i+1]==0))
            {
                flowerbed[i]=1;
                c++;
            }
        
        if(c>=n)
        return true;
        }
        return false;
    }
}