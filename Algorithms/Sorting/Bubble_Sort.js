const array = [6, 1, 4, 3, 5, 2];

function Bubble_Sort(array) {
    console.log("During Sorting:- ")
    const size = array.length;
    if (size < 2) {
        console.log("Skipped Sorting !!");
        return;
    }
    for (let i = 0; i < size - 1; i++) {
        for (let j = 0; j < size - 1 - i; j++) {
            if (array[j] > array[j + 1]) {
                swapElements(array, j, j + 1);
            }
        }
        console.log(array);
    }
}

function swapElements(array, i, j) {
    let temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

console.log("Before Sorting:- ", array);
Bubble_Sort(array);
console.log("After Sorting:- ", array);