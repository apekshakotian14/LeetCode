class PhoneDirectory {
    private LinkedList<Integer> q;
    private HashSet<Integer> set;
    public PhoneDirectory(int maxNumbers) {
        this.q = new LinkedList<>();
        this.set = new HashSet<>();
        for(int i=0; i<maxNumbers; i++){
            this.q.add(i);
            this.set.add(i);
        }
    }
    
    public int get() {
        if(q.isEmpty()) return -1;
        int re = q.poll();
        set.remove(re);
        return re;
    }
    
    public boolean check(int number) {
        return set.contains(number);
    }
    
    public void release(int number) {
        if(!set.contains(number)){
            q.add(number);
            set.add(number);
        }   
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */