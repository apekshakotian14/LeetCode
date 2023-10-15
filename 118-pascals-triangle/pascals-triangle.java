class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i<numRows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j==i || j==0){
                    list.add(1);
                }else{
                    int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    list.add(sum);
                }
            }
            result.add(list);
        }
        return result;
    }
}