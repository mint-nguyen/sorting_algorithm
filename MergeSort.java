public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int[] arr1 = new int[arr.length / 2];
            System.arraycopy(arr, 0, arr1, 0, arr.length / 2);

            int arr2Length = arr.length - arr.length / 2;
            int[] arr2 = new int[arr2Length];
            System.arraycopy(arr, arr.length / 2, arr2, 0, arr2Length);

            mergeSort(arr1);
            mergeSort(arr2);
            merge(arr1, arr2, arr);
        }
    }

    public static void merge(int[] arr1, int[] arr2, int[] arr) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < arr1.length && current2 < arr2.length) {
            if (arr1[current1] < arr2[current2]) {
                arr[current3++] = arr1[current1++];
            } else {
                arr[current3++] = arr2[current2++];
            }
        }

        while (current1 < arr1.length) {
            arr[current3++] = arr1[current1++];
        }

        while (current2 < arr2.length) {
            arr[current3++] = arr2[current2++];
        }
    }
}
