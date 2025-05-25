/**
 *? Binary Search Algorithm (Recursive Version)
 *
 *? Description:
 * Binary Search is a divide-and-conquer algorithm used to find the position of a target value
 * within a **sorted array**. It works by repeatedly dividing the search interval in half.
 * If the target value is less than the middle element, the search continues on the left half.
 * If it's greater, the search continues on the right half. The process repeats until the value is found or the interval is empty.
 *
 *? Key Points:
 * - Works only on **sorted arrays**
 * - Time Complexity: O(log n)
 * - Space Complexity: O(log n) due to recursion stack
 * - Efficient for large datasets
 *
 *? Recursive Approach:
 * - Base Case: If start index exceeds end index, the target is not found → return -1
 * - Recursive Case:
 *   - If middle element matches the target → return index
 *   - If middle element is less than the target → search right half
 *   - If middle element is greater than the target → search left half
 */

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const target = 6;

function Binary_Search(array, start, end, target) {
    if (start > end) return -1; // Base case: element not found

    const mid = start + Math.floor((end - start) / 2); // Find middle index

    if (array[mid] === target) return mid; // Target found
    else if (array[mid] < target)
        return Binary_Search(array, mid + 1, end, target); // Search right half
    else
        return Binary_Search(array, start, mid - 1, target); // Search left half
}

const index = Binary_Search(array, 0, array.length - 1, target);

if (index !== -1)
    console.log("Element Found at Index:", index);
else
    console.log("Element Not Found !!");
