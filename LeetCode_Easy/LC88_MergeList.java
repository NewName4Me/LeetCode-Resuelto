package LeetCode_Easy;
import java.util.Arrays;

public class LC88_MergeList {

    public static void main(String[] args) {
        /*
        You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

        Merge nums1 and nums2 into a single array sorted in non-decreasing order.

        The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

        Example 1:

        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
        
        https://leetcode.com/problems/merge-sorted-array/description/
         */
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //VARIABLES
        //nuevo array con longitud limitada a la suma de los limites establecidos por nuestros enteros como indica el enunciado
        int merge[] = new int[m + n];
        int z = 0;

        //PROGRAMA
        for (int i = 0; i < m; i++) { //introducimos los valores del primer array
            merge[i] = nums1[i];
        }
        for (int j = m; j < n + m; j++) {//ahora introducimos los del segundo
            merge[j] = nums2[z];
            z++;
        }

        System.arraycopy(merge, 0, nums1, 0, merge.length); //copia merge en nums1
        
        Arrays.sort(nums1);//lo ordenamos automaticamente

        System.out.println(Arrays.toString(nums1));

    }
}
