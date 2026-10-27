class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] totals=new int[1001];
        for(int[] row:nums1)
        totals[row[0]]+=row[1];
        for(int[] row:nums2)
        totals[row[0]]+=row[1];
        List<int[]> answer=new ArrayList<>();
        for(int id=1;id<=1000;id++)
            if(totals[id]>0)
            answer.add(new int[]{id,totals[id]});
        return answer.toArray(new int[0][]);
    }
}