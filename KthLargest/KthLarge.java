package KthLargest;
import java.util.Random;
import java.util.Scanner;

public class KthLarge {
    public int findKthLarge(int[] nums, int k) {
        return quickSelect(nums, 0,nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums,int left,int right,int k) {
        if (left == right) {
            return nums[left];
        }

        Random rand = new Random();
        int pivot = left + rand.nextInt(right - left + 1);
        pivot = partition(nums, left, right, pivot);

        if (k == pivot) {
            return nums[k];
        } else if (k < pivot) {
            return quickSelect(nums, left, pivot - 1, k);
        } else {
            return quickSelect(nums, pivot + 1, right, k);
        }
    }

    private int partition(int[] nums, int left, int right, int pivot) {
        int pivotValue = nums[pivot];
        swap(nums, pivot, right);
        int storeIndex = left;

        for (int i = left; i <= right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the length of the array: ");
        int k = sc.nextInt();
        KthLarge find = new KthLarge();
        System.out.println("The " + k + "th largest element is " + find.findKthLarge(arr, k));
    }
}


























