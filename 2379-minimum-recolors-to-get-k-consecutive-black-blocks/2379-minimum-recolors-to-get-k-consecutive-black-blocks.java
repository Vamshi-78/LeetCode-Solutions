class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int c=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')
            c++;
        }
        int min=c;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i-k)=='W')
            c--;
            if(blocks.charAt(i)=='W')
            c++;
            min=Math.min(c,min);
        }
        return min;
    }
}