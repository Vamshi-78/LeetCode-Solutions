class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int res=0;
        for(int i=1;i<=n;i++){
            res+=(26-(s.charAt(i-1)-'a'))*i;
        }
        return res;
    }
}