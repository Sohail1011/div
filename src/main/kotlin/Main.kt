fun main() {
    /*println(2 + 2)
    println(2 / 2)
    println(2 % 2)
    println(2 - 2)
    println(2 * 2)
    println(5 * 2 / 3)
    println(7 * (2 / 2) / 3)*/

    //Comparaciones e igualdades
    /*println(2 == 2)
    println(2 != 2)
    println(2 > 2)
    println(2 >= 2)
    println(2 <= 2)
    println(2 < 2)*/

    var anynumber: Int = 2
    // Operaciones con variable
    anynumber += 10
    anynumber -= 2
    anynumber %= 6
    anynumber /= 4
    anynumber *= 6
    // Incrementadores
    anynumber++
    anynumber--
    println(anynumber)
    //Operadores booleanos
    var isTrue: Boolean = true
    var isFalse: Boolean = false
    //And
    println(isTrue && isFalse)
    //Or
    println(isTrue || isFalse)
    //Not
    println(!isTrue)
    HelloWorld()
    var myNumber: Int = dobleTheValue(4)
    println(myNumber)
    favoriteFoodPrompt()
}

fun HelloWorld() {
    println("Hello World")
}

fun dobleTheValue(numberValue: Int): Int {
    return numberValue * 2
}

fun favoriteFoodPrompt(name: String = "Min min", favoriteFood: String = "Dai me"): Unit {
    println("$name's favorite food is $favoriteFood.")
}