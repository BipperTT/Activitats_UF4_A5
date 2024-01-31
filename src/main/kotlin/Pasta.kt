package org.example

class Pasta {

    private var nom: String = ""
    private var preu: Double = 0.0
    private var pes: Double = 0.0
    private var calories: Double = 0.0

    constructor(nom: String, preu: Double, pes: Double, calories: Double) {
        this.nom = nom
        this.preu = preu
        this.pes = pes
        this.calories = calories
    }

    fun getNom(): String {
        return nom
    }

    fun getPreu(): Double {
        return preu
    }

    fun getPes(): Double {
        return pes
    }

    fun getCalories(): Double {
        return calories
    }


    fun setNom(nouNom: String) {
        nom = nouNom
    }

    fun setPreu(nouPreu: Double) {
        preu = nouPreu
    }

    fun setPes(nouPes: Double) {
        pes = nouPes
    }

    fun setCalories(nouCalories: Double) {
        calories = nouCalories
    }

    override fun toString(): String {
        return "$nom: Preu: $preu€, Pes: ${pes}g, Calories: ${calories}kcal"
    }

}
