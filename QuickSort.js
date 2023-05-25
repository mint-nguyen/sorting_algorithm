const quickSort = (arr) => {
	if (arr.length < 2) return arr;

	let pivot = arr[0];
	let left = [];
	let right = [];

	for (let i = 1; i < arr.length; i++) {
		if (arr[i] < pivot) left.push(arr[i]);
		else right.push(arr[i]);
	}
	return [...quickSort(left), pivot, ...quickSort(right)];
};

// 1. First or Last Element as Pivot:

// Worst Case: O(n^2)
// Average Case: O(n log n)
// Best Case (when the input array is already sorted): O(n^2)

// 2. Random Element as Pivot:

// Worst Case: O(n^2)
// Average Case: O(n log n)
// Best Case: O(n log n)

// 3. Median-of-Three Pivot:

// Worst Case: O(n^2)
// Average Case: O(n log n)
// Best Case: O(n log n)

const arr = [1, -5];

console.log(quickSort(arr));
