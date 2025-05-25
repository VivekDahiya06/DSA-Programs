const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const target = 6;


function Binary_Search(array, start, end, target) {
    if (start > end) return -1;

    const mid = start + Math.floor((end - start) / 2);
    if (array[mid] === target) return mid;
    else if (array[mid] < target) return Binary_Search(array, mid + 1, end, target);
    else return Binary_Search(array, start, mid - 1, target);
}

const index = Binary_Search(array, 0, array.length - 1, target);
if (index !== -1) console.log("Element Found at Index: ", index);
else console.log("Element Not Found !!");