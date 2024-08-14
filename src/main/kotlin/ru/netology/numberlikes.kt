package ru.netology

fun main() {
    // Число лайков
    val likes = readlnOrNull()?.toIntOrNull() ?: return

    // Определение правильной формы слова
    val word = when {
        likes % 10 == 1 && likes % 100 != 11 -> "человеку"
        likes % 10 in 2..4 && (likes % 100 !in 12..14) -> "людям"
        else -> "людям"
    }

    // Вывод результата
    println("Понравилось $likes $word")
}
