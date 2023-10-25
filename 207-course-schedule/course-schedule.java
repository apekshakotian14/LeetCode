class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int [] indegrees = new int[numCourses];
        for(int [] pr: prerequisites){
            int out = pr[1];
            int in = pr[0];
            indegrees[in]++;
            if(!map.containsKey(out)){
                map.put(out, new ArrayList<>());
            }
            map.get(out).add(in);
        }
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i=0; i<numCourses; i++){
            if(indegrees[i] == 0){
                q.add(i);
                count++;
            }
        }
        if(count == numCourses) return true;
        if(q.isEmpty()) return false;
        while(!q.isEmpty()){
            int parent = q.poll();
            List<Integer> child = map.get(parent);
            if(child != null){
                for(int ch: child){
                indegrees[ch]--;
                if(indegrees[ch] == 0){
                    q.add(ch);
                    count++;
                }
            }
            }
            
        }
        return count == numCourses;
    }
}