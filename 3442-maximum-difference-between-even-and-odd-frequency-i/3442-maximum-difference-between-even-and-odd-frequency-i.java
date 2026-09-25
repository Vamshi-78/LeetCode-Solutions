class Solution {
    public int maxDifference(String s) {
        int[] c=new int[26];
        for(char ch:s.toCharArray()){
            c[ch-'a']++;
        }
        int even_min=s.length(),odd_max=0;
        for(int count:c){
            if((count&1)==1){
                odd_max=Math.max(odd_max,count);
            }
            else if(count>0){
                even_min=Math.min(even_min,count);
            }
        }
        return odd_max-even_min;
    }
}