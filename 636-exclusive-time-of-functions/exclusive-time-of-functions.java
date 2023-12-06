class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int prev = 0;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(String log : logs){
            String[] splitLog = log.split(":");
            int currTaskId = Integer.parseInt(splitLog[0]);
            int curr = Integer.parseInt(splitLog[2]);
            if(splitLog[1].equals("start")){
                if(!st.isEmpty()){
                    result[st.peek()] += curr - prev;
                }
                prev = curr;
                st.push(currTaskId);
            }else{
                 result[st.pop()] += curr + 1 - prev;
                 prev = curr + 1;
            }
        }
        return result;
    }
}