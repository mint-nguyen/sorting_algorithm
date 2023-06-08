// Create an array that consists of 20 numbers in some random order. Use the
// BUBBLE SORT algorithm to sort the 20 numbers in descending order.
// Write a JAVA program to implement the BUBBLE SORT algorithm.

public class DescendingBubbleSort {
    public static void main(String[] args) {
        int[] list = { 3, 5, 2, 6, 10, 35, 26, 48, 1, 0, 24, 2, 6, 12, 5, 246, 48, 1, 0, 45 };
        descendingBubleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void descendingBubleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] < list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
