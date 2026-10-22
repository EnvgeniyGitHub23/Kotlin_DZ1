// Котлин ДЗ №1 от 01.10.2026

fun main() {
    // ===== 1. Переменные  =====
    val byteVar: Byte = 127
    val shortVar: Short = 32000
    val intVar: Int = 2_000_000
    val longVar: Long = 9_000_000_000L
    val floatVar: Float = 3.14f
    val doubleVar: Double = 2.71828
    val charVar: Char = 'A'
    val boolVar: Boolean = true
    val stringVar: String = "Kotlin_DZ1"

    println("Byte: $byteVar")
    println("Short: $shortVar")
    println("Int: $intVar")
    println("Long: $longVar")
    println("Float: $floatVar")
    println("Double: $doubleVar")
    println("Char: $charVar")
    println("Boolean: $boolVar")
    println("String: $stringVar")
    println("-----------------------------")

    // ===== Вызовы методов =====
    greet("Иван")

    println("Число -5 отрицательное? ${isNegative(-5)}")
    println("Число 10 отрицательное? ${isNegative(10)}")

    printSign(0)
    printSign(-42)
    printSign(7)

    println("Числа от 1000 до 0, кратные 3:")
    printMultiplesOfThree()
}

// ===== 2. Приветствие по имени =====
fun greet(name: String) {
    println("Привет, $name!")
}

// ===== 3. Возвращает true, если число отрицательное =====
fun isNegative(number: Int): Boolean {
    return number < 0
}

// ===== 4. Печатает, положительное или отрицательное число =====
fun printSign(number: Int) {
    when {
        number < 0 -> println("Число $number отрицательное")
        number > 0 -> println("Число $number положительное")
        else -> println("Число $number равно нулю")
    }
}

// ===== 5. Последовательность от 1000 до 0, кратная 3 =====
fun printMultiplesOfThree() {
    for (i in 1000 downTo 0) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
    println()
}