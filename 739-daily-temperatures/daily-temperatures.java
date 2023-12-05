class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(!st.empty() && temperatures[i]>temperatures[st.peek()]){
            int popped = st.pop();
            result[popped] = i - popped;
        }st.push(i);
        }
        return result; 
    }
}