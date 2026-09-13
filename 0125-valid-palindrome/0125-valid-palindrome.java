class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n=filtered.length();
        int left=0;
        int right=n-1;
        while(left < right){
            if(filtered.charAt(left)==filtered.charAt(right)){
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}