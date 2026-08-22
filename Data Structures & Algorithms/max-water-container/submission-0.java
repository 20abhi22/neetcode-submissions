class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=0;
        int minheight;
        while(i<j){
            minheight=Math.min(heights[i],heights[j]);
            max=Math.max(max,minheight*(j-i));
            if(heights[i]>heights[j])j--;
            else{
                i++;
            }
        }

        return max;

        
    }
}
