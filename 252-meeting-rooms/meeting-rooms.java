class Meeting{
    int start;
    int  end;

    public Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
}
class MyComparator implements Comparator<Meeting> {
    @Override
    public int compare(Meeting p1, Meeting p2){
        if(p1.end < p2.end)return -1;
        else if(p1.end == p2.end)return 0;
        return 1;
    }
}

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0; i<intervals.length; i++)meetings.add(new Meeting(intervals[i][0], intervals[i][1]));

        MyComparator myComp = new MyComparator();
        Collections.sort(meetings, myComp);

        for(int i=0; i<meetings.size()-1; i++){
            if(meetings.get(i).end > meetings.get(i+1).start)return false;
        }

        return true;
    }
}