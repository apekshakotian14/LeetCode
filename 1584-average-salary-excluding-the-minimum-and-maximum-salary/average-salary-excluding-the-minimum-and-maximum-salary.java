class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        double count = 0;
        for(int i=1; i<salary.length-1; i++){
            sum += salary[i];
            count += 1;
        }
        double avg = sum/count;
        return avg;
    }
}