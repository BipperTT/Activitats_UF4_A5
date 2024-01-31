package org.example


fun main() {

    val croissant = Pasta("Croissant", 0.5, 150.0, 280.0)
    val ensaimada = Pasta("Ensaimada", 0.7, 130.0, 260.0)
    val donut = Pasta("Donut", 0.33, 110.0, 210.0)

    val aigua = Beguda("Aigua", 1.0, false)
    val cafeTallat = Beguda("Café tallat", 1.35, false)
    val teVermell = Beguda("Té vermell", 1.5, false)
    val cola = Beguda("Cola", 1.65, true)

    // Mostrem per pantalla
    println("Pastes:")
    println(croissant)
    println(ensaimada)
    println(donut)

    println("\nBegudes:")
    println(aigua)
    println(cafeTallat)
    println(teVermell)
    println(cola)

}

