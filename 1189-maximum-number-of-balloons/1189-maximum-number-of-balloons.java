class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        for(char c:text.toCharArray()){
            freq[c-'a']++;
        }
        int min=0;
        for(int i=0;i<freq.length;i++){
            min=Math.min(freq['b'-'a'],freq['a'-'a']);
            min=Math.min(min,(freq['l'-'a'])/2);
            min=Math.min(min,(freq['o'-'a'])/2);
            min=Math.min(min,freq['n'-'a']);
        }
        return min;
    }
}