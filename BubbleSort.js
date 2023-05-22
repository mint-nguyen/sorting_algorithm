const bubbleSort = (arr) => {
	for (let i = arr.length - 1; i >= 0; i--) {
		for (let j = 0; j < i; j++) {
			if (arr[j + 1] < arr[j]) {
				let temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
};

const arr = [1, 64, 24, -5, -23];
bubbleSort(arr);

console.log(arr);
