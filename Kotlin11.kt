// 11. Написать функцию, которая проверяет делится ли число на 2.
fun main() {
    val number = 10
    println(check(number))
}

fun check(number: Int): Boolean {
    return number % 2 == 0
}