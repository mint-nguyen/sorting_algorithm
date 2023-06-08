public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(arr, first, last);
            quickSort(arr, first, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] arr, int first, int last) {
        int pivot = arr[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && arr[low] <= pivot) {
                low++;
            }

            while (low <= high && arr[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
        }

        while (high > first && arr[high] >= pivot) {
            high--;
        }

        if (pivot > arr[high]) {
            arr[first] = arr[high];
            arr[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
}
