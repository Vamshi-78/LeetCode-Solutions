class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        
        for(int i=0;i<n;i++){
            int curr=asteroids[i];
            boolean alive=true;
            while(!st.isEmpty()&&st.peek()>0&&curr<0){
                if(Math.abs(st.peek())<Math.abs(curr)){
                    st.pop();
                    continue;
                }
                else if(Math.abs(st.peek())==Math.abs(curr)){
                    st.pop();
                    alive=false;
                    break;
                }
                else{
                    alive=false;
                    break;
                }
            }
            if(alive)
            st.push(curr);
        }
        int[] res=new int[st.size()];
        for(int i=0;i<st.size();i++){
            res[i]=st.get(i);
        }
        return res;
    }
}