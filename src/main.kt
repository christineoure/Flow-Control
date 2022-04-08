fun main() {
    numbers()
    var y = Names(arrayOf("Misanta", "Santana", "Hawi", "Bob", "Amelea", "John"))
    println(y)
    giveDrinks(6)
    giveDrinks(13)
    giveDrinks(24)
    nums()

}

fun numbers() {
    for (num in 1..100)
        if (num % 2 != 0) {
            println(num)
        }
}

fun Names(names: Array<String>): Int {
    var num = 0
    for (name in names) {
        if (name.length >= 5) {
            num++
        }
    }
    return num
}

fun giveDrinks(age: Int) {
    if (age < 6) {
        println("Give milk")
    } else if (age < 15 && age > 6) {
        println("Give Fanta")
    } else {
        println("Give cocacola")
    }

}

fun nums() {
    for (digits in 1..100) {
        if (digits % 3 == 0 && digits % 5 == 0) {
            println("FizzBuzz")
        } else if (digits % 3 == 0) {
            println("Fizz")
        } else if (digits % 5 == 0) {
            println("Buzz")
        }else{
            println(digits)
        }

    }
}


