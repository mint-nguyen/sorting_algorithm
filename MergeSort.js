const merge = (arr1, arr2, arr) => {
	let i = 0; // Current index of arr1
	let j = 0; // Current index of arr2
	let k = 0; // Current index of arr

	while (i < arr1.length && j < arr2.length) {
		if (arr1[i] < arr2[j]) arr[k++] = arr1[i++];
		else arr[k++] = arr2[j++];
	}

	while (i < arr1.length) arr[k++] = arr1[i++];

	while (j < arr2.length) arr[k++] = arr2[j++];
};

const mergeSort = (arr) => {
	if (arr.length < 2) return;

	let firstHalf = arr.slice(0, Math.floor(arr.length / 2));
	mergeSort(firstHalf);

	let secondHalf = arr.slice(Math.floor(arr.length / 2));
	mergeSort(secondHalf);

	merge(firstHalf, secondHalf, arr);
};

const arr = [1, -5];
mergeSort(arr);

console.log(arr);
