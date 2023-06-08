// Create an array that consists of 20 numbers in some random order. Use the
// MERGE SORT algorithm to sort the 20 numbers in descending order. Write
// a JAVA program to implement the MERGE SORT algorithm.

public class DescendingMergeSort {
    public static void main(String[] args) {
        int[] list = { 3, 5, 2, 6, 10, 35, 26, 48, 1, 0, 24, 2, 6, 12, 5, 246, 48, 1, 0, 45 };
        descendingMergeSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void descendingMergeSort(int[] list) {
        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            descendingMergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            descendingMergeSort(secondHalf);

            descendingMerge(firstHalf, secondHalf, list);
        }
    }

    public static void descendingMerge(int[] firstHalf, int[] secondHalf, int[] list) {
        int currentFirstHalf = 0;
        int currentSecondHalf = 0;
        int currentList = 0;

        while (currentFirstHalf < firstHalf.length && currentSecondHalf < secondHalf.length) {
            if (firstHalf[currentFirstHalf] < secondHalf[currentSecondHalf]) {
                list[currentList++] = secondHalf[currentSecondHalf++];
            } else {
                list[currentList++] = firstHalf[currentFirstHalf++];
            }
        }

        while (currentFirstHalf < firstHalf.length) {
            list[currentList++] = firstHalf[currentFirstHalf++];
        }

        while (currentSecondHalf < secondHalf.length) {
            list[currentList++] = secondHalf[currentSecondHalf++];
        }
    }

}
