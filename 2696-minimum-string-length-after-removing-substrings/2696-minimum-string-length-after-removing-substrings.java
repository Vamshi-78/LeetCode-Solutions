class Solution {
    public int minLength(String s) {
        int n=s.length();
        if(n<=1)
        return n;
        StringBuilder stack=new StringBuilder();
        for(int i=0;i<n;i++){
            if(stack.length()>0){
                char last=stack.charAt(stack.length()-1);
                char curr=s.charAt(i);
                if(last=='A'&&curr=='B'||last=='C'&&curr=='D'){
                    stack.deleteCharAt(stack.length()-1);
                }
                else{
                    stack.append(s.charAt(i));
                }
            }
            else{
                    stack.append(s.charAt(i));
                }    
        }
        return stack.length();
    }
}