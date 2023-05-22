const recursiveInsertionSort = (arr, n) => {
	// Base case
	if (n <= 1) return;

	// Sort first n-1 elements
	recursiveInsertionSort(arr, n - 1);

	// Insert last element at its correct position
	// in sorted array.
	let last = arr[n - 1];
	let j = n - 2;

	/* Move elements of arr[0..i-1], that are
 greater than key, to one position ahead
 of their current position */
	while (j >= 0 && arr[j] > last) {
		arr[j + 1] = arr[j];
		j--;
	}
	arr[j + 1] = last;
};

const arr = [1, 64, 24, -5, -23];
recursiveInsertionSort(arr, arr.length);

console.log(arr);
