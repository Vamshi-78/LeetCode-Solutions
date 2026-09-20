class Solution {
    public char findTheDifference(String s, String t) {
        int i=s.length();
        int j=t.length();
        int sum1=0;
        int sum2=0;
        for(int a=0;a<i;a++){
            sum1+=s.charAt(a);
        }
        for(int a=0;a<j;a++){
            sum2+=t.charAt(a);
        }
        int ans=Math.abs(sum1-sum2);
        return (char)ans;
    }
}