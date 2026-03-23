package array;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findStart(nums, target);
        result[1] = findEnd(nums, target);
        return  result;
    }

    public int findStart(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target) right  = mid - 1;
            else left = mid + 1;
            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    public int findEnd(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 5, 10, 12, 89};

    }

}
