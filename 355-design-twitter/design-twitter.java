class Twitter {
    class Tweet{
        int tid; int created_at;
        public Tweet(int id, int created_at){
            this.tid = id;
            this.created_at = time;
        }
    }
    HashMap<Integer, HashSet<Integer>> userMap;
    HashMap<Integer, List<Tweet>> tweets;
    int time;
    public Twitter() {
       this.userMap = new HashMap<>();
       this.tweets = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!tweets.containsKey(userId)){
            follow(userId, userId);
            tweets.put(userId, new ArrayList<>());
        }
        time++;
        tweets.get(userId).add(new Tweet(tweetId, time));
        
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> a.created_at - b.created_at);
        List<Integer> result = new ArrayList<>();
        if(userMap.containsKey(userId)){
            HashSet<Integer> followed = userMap.get(userId);
            for(int fid : followed){
                List<Tweet> ftweets = tweets.get(fid);
                if(ftweets != null){
                    for(Tweet t : ftweets){
                        pq.add(t);
                        if(pq.size() > 10){
                            pq.poll();
                        }
                    }
                }
            }
        }
        while(!pq.isEmpty()){
            result.add(0, pq.poll().tid);
        }
        return result;
        }
    public void follow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)){
            userMap.put(followerId, new HashSet<>());
        }
        userMap.get(followerId).add(followeeId);
    }
    
    
    
    public void unfollow(int followerId, int followeeId) {
        if(followerId != followeeId && userMap.containsKey(followerId)){
            userMap.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */