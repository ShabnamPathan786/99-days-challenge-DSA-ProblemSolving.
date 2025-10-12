public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] merged = new int[len];
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Add remaining elements
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        // Find median
        int mid = len / 2;
        if (len % 2 == 1) {
            // Odd length → middle element
            return merged[mid];
        } else {
            // Even length → average of two middle elements
            return (merged[mid - 1] + merged[mid]) / 2.0;
        }
    }

    
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
