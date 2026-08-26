class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        List<Integer> ones=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')
            ones.add(i);
        }
        int min=Integer.MAX_VALUE;
        String ans="";

        if(ones.size()<k){
            return ans;
        }
        for(int i=0;i<=ones.size()-k;i++){
            int start=ones.get(i);
            int end=ones.get(i+k-1);
            int length=end-start+1;
            String cand=s.substring(start,end+1);
            if(length<min){
            min=length;
            ans=cand;
            }
            else if(min==length&&cand.compareTo(ans)<0){
                ans=cand;
            }
        }
        return ans;
    }
}