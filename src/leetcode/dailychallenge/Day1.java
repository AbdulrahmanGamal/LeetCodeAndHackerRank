package leetcode.dailychallenge;

public class Day1 {
    static class BinarySearch {
        public int search(int[] nums, int target) {

            int left = 0;
            int len = nums.length;
            int right = len - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (target == nums[mid]) {
                    return mid;
                }
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                }
            }

            return -1;
        }

        public int recursiveBinarySearch(int[] nums, int target, int left, int right) {

            // **** base case ****
            if (left > right)
                return -1;

            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
            return recursiveBinarySearch(nums, target, left, right);
        }
    }

    public static void main(String[] args) {
        // BinarySearch
        int arr[] = {-1, 0, 3, 5, 9, 12};
        System.out.println(new BinarySearch().search(arr, 9));
        // Recursive BinarySearch
        System.out.println(new BinarySearch().recursiveBinarySearch(arr, 9, 0, arr.length - 1));
    }
}
