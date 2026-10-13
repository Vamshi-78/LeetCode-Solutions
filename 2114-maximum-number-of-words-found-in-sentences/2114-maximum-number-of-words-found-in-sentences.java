class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int c=1;
        int max=0;
        for(String s:sentences){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ')
                c++;
            }
            max=Math.max(max,c);
            c=1;
        }
        return max;
    }
}