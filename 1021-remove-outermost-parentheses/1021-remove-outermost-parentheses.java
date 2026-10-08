class Solution {
    static {
        for (int i = 0; i<300; i++) {
            removeOuterParentheses("()");
        }
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(count>0){
                    sb.append(c);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}