class Solution {
    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int mini = 0;
        for (int i = 0; i < n; i++) {
            boolean isexploded=false;
            if (a[i] < 0) {
                mini = Math.abs(a[i]);
                while (!st.isEmpty() && st.peek() >0) {
                    if(st.peek()<mini){
                        st.pop();
                    }
                    else if(st.peek()==mini){
                        st.pop();
                        isexploded=true;
                        break;
                    }
                    else{
                        isexploded=true;
                        break;
                    }
                }
            }
            if(!isexploded)
            st.push(a[i]);
        }

        int[] answ = new int[st.size()];
        for (int i = answ.length - 1; i >= 0; i--) {
            answ[i] = st.pop();
        }

        return answ;
    }
}
