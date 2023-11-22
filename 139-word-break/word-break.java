class Solution {
    HashMap<String, Boolean> map;
    public boolean wordBreak(String s, List<String> wordDict) {
        this.map = new HashMap<>();
        HashSet<String> set = new HashSet<>(wordDict);
        return helper(s, set);

    }

    private boolean helper(String s, HashSet<String> set){
        if(s.length() == 0) return true;

        for(int i=0; i<s.length(); i++){
            String sub = s.substring(0, i+1);
                if(set.contains(sub)){
                    String subst = s.substring(i+1);
                        if(!map.containsKey(subst)){
                            boolean re = helper(subst, set);
                            map.put(subst, re);
                        }
                        if(map.get(subst)){
                            return map.get(subst);
                        }
                        
                    }
                }
                return false;
            }
        }