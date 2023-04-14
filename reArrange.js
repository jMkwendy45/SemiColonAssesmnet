let arr = [-10,-1,20,4,5,-9,-6];
let j = 0;

for (let i = 0; i < arr.length; i++) {
  if (arr[i] < 0) {
    if (i !== j) {
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    j++;
  }
}

console.log(arr);