const array = [8, 4, 5, 2, 7, 9, 3, 1];
const target = 9;


function Linear_Search(array, target) {
    const size = array.length;
        for (let i = 0; i < size; i++) {
            if (array[i] === target) {
                return i;
            }
        }
        return -1;
}

const index = Linear_Search(array, target);
if(index !== -1) console.log("Element Found at Index: ",index);
else console.log("Element Not Found !!");