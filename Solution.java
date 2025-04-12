class Solution {
    public int maxArea(int[] height) {
        int leftPoint = 0;
        int rightPoint = height.length - 1;
        int maxArea = 0;

        while (leftPoint < rightPoint) {
            int width = rightPoint - leftPoint;
            int currentHeight = Math.min(height[leftPoint], height[rightPoint]);
            int area = width * currentHeight;
            maxArea = Math.max(maxArea, area);

            // Move the pointer with the smaller height
            if (height[leftPoint] < height[rightPoint]) {
                leftPoint++;
            } else {
                rightPoint--;
            }
        }

        return maxArea;

    }
}