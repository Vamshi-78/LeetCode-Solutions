class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i==j) continue;
            for(int k=0;k<n;k++){
            if(digits[k]==0) continue;
            if(k==j || k==i) continue;
            int num=100*digits[k]+10*digits[j]+digits[i];
            if(num%2==0) set.add(num);
            }
          }
        }
        return set.size();
    }
}