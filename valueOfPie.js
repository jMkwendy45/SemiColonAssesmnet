let numerator = 4;
let denominator = 1;
let series = 0.0;
for (let i = 1; i <= 20000; i++) {
    if (i % 2 == 0) {
        series -=  numerator/ denominator;
    } else {
        series += numerator / denominator;
    }
    denominator+=2;

    console.log(i +"            "+series)

}