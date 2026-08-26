class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> ch=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<n;r++){
            while(ch.contains(s.charAt(r))){
                ch.remove(s.charAt(l));
                l++;
            }
            ch.add(s.charAt(r));
            int currLen=ch.size();
            max=Math.max(max,currLen);
        }
        return max;
    }
}