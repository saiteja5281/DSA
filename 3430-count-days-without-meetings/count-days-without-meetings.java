class Solution {
    public int countDays(int k, int[][] arr) {
        int n=arr.length;
       Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
       ArrayList<int[]>merged=new ArrayList<>();
       int start = arr[0][0], end = arr[0][1];
        for (int i = 1; i < n; i++) {
            if (arr[i][0] <= end + 1) { 
                end = Math.max(end, arr[i][1]); 
            } else {
                merged.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        merged.add(new int[]{start, end}); 
           int uncovered = merged.get(0)[0] - 1; 
        for (int i = 0; i < merged.size() - 1; i++) {
            uncovered += merged.get(i + 1)[0] - merged.get(i)[1] - 1; 
        }
        uncovered += k - merged.get(merged.size() - 1)[1]; 

        return uncovered;
       
    }
}