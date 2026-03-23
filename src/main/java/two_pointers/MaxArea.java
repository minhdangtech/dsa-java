package two_pointers;

import java.util.Arrays;

public class MaxArea {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
           int left_height = height[left];
           int right_height = height[right];
           int container_height = Math.min(left_height, right_height);
           int area = container_height * (right - left);
           if(area > max) max = area;
           if(left_height < right_height) left++;
           else if (left_height > right_height) right--;
           else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 1};
        System.out.println(maxArea(arr));
    }
}
