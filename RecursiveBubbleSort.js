const recursiveBubbleSort = (arr, i) => {
	if (i < 0) return;

	for (let j = 0; j < i; j++) {
		if (arr[j + 1] < arr[j]) {
			let temp = arr[j + 1];
			arr[j + 1] = arr[j];
			arr[j] = temp;
		}
	}

	recursiveBubbleSort(arr, i - 1);
};

const arr = [1, 64, 24, -5, -23];
recursiveBubbleSort(arr, arr.length - 1);

console.log(arr);
