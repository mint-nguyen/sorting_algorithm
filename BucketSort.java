public class BucketSort {

}

// O(n+t) (t is the max num of digits)
// Use bucket sort to sort: 133, 544, 1230, 43, 2334, 354, 955, 543, 999
// 1. 1230, 133, 43, 543, 544, 2334, 354, 955, 999
// 2. 1230, 133, 2334, 43, 543, 544, 354, 955, 999
// 3. 43, 133, 1230, 2334, 354, 543, 544, 955, 999
// 4. 43, 133, 354, 543, 544, 955, 999, 1230, 2334