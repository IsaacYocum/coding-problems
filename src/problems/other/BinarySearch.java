package problems.other;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetIndex = binarySearch(arr, 0, arr.length - 1, 2);
        System.out.println(targetIndex);
    }

    static int binarySearch(int[] arr, int head, int tail, int targetValue) {
        if (targetValue < arr[head] || targetValue > arr[tail]) {
            return -1;
        }

        int mid = tail / 2;
        if (arr[head] == targetValue) return head;
        if (arr[mid] == targetValue) return mid;
        if (arr[tail] == targetValue) return tail;

        if (targetValue < mid) {
            return binarySearch(arr, head, mid, targetValue);
        } else {
            return binarySearch(arr, mid + 1, tail, targetValue);
        }
    }
}
