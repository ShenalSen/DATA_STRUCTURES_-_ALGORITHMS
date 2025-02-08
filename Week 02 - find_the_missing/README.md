
# Smallest Missing Number Finder

This repository contains three different algorithms to find the smallest missing nonnegative number in an array of nonnegative integers. Each algorithm demonstrates a different approach and time complexity.

## Algorithms

### 1. Sorting and Searching Algorithm

This algorithm sorts the input array and then finds the smallest missing nonnegative number by iterating through the sorted array.

**Steps:**
1. Sort the array.
2. Initialize `missingNumber` to 0.
3. Iterate through each element `num` in the sorted array:
   - If `num` is equal to `missingNumber`, increment `missingNumber`.
   - If `num` is greater than `missingNumber`, break the loop.
4. Return `missingNumber`.

**Time Complexity:** O(n log n)

### 2. Runtime Measurement with Sorting

This algorithm creates an input array, sorts it, and measures the runtime, including the sorting step.

**Steps:**
1. Create an input array of the specified size with random nonnegative integers.
2. Sort the array.
3. Initialize `missingNumber` to 0.
4. Iterate through each element `num` in the sorted array:
   - If `num` is equal to `missingNumber`, increment `missingNumber`.
   - If `num` is greater than `missingNumber`, break the loop.
5. Return `missingNumber`.
6. Measure and print the runtime.

**Time Complexity:** O(n log n)

### 3. Runtime Measurement with Pre-sorted Input

This algorithm assumes the input is already sorted and measures only the time taken by the actual search operation.

**Steps:**
1. Create an input array of the specified size with random nonnegative integers.
2. If the `sort` variable is true, sort the array.
3. Initialize `missingNumber` to 0.
4. Iterate through each element `num` in the sorted array:
   - If `num` is equal to `missingNumber`, increment `missingNumber`.
   - If `num` is greater than `missingNumber`, break the loop.
5. Return `missingNumber`.
6. Measure and print the runtime (excluding sorting time if `sort` is true).

**Time Complexity (measured):** O(n)

**Note**: The measured time complexity in this scenario is O(n) since we assume the input is already sorted and only measure the search time. However, if sorting is included, the total time complexity would be O(n log n).

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.

