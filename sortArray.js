function sortArrayDescending(arr) {
    // Use the Array.sort() method with a custom compare function
    arr.sort(function(a, b) {
        return b - a; // Compare in descending order
    });
}

const numbers = [5, 2, 9, 1, 5, 6];
sortArrayDescending(numbers);
console.log(numbers); // This will output: [9, 6, 5, 5, 2, 1]
