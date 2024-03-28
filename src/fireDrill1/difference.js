class Person {
    minMAx(numbers) {
        let min = numbers[0]
        let max = numbers[0]
        for (let count = 0; count < numbers.length; count++) {
            if (count < min) min = count
            if (count > max) max = count
        }
        return [max - min]
    }
}

person = new Person()
let value = [2, 4, 5, 7, 8];
console.log(person.minMAx(value))
var num = 5
console.log(num)
var num = 7
console.log(num)
let num = 5
console.log(num)
const nam = 7