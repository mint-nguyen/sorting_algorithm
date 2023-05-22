const InsertionSort = (arr) => {
	for (let i = 1; i < arr.length; i++) {
		let j = i - 1;
		let temp = arr[i];
		while (j >= 0 && arr[j] > temp) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = temp;
	}

	return arr;
};

const arr = [1, 64, 24, -5, -23];
InsertionSort(arr);

console.log(arr);
