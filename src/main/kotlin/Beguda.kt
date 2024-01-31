package org.example

class Beguda {

    private var nom: String = ""
    private var preu: Double = 0.0
    private var teIncrementSucre: Boolean = false

    constructor(nom: String, preu: Double, teIncrementSucre: Boolean) {
        this.nom = nom
        this.preu = preu
        this.teIncrementSucre = teIncrementSucre
    }

    fun getNom(): String {
        return nom
    }

    fun getPreu(): Double {
        return preu
    }

    fun teIncrementSucre(): Boolean {
        return teIncrementSucre
    }

    fun setNom(nouNom: String) {
        nom = nouNom
    }

    fun setPreu(nouPreu: Double) {
        preu = nouPreu
    }

    fun setIncrementSucre(nouIncrementSucre: Boolean) {
        teIncrementSucre = nouIncrementSucre
    }

    override fun toString(): String {
        return "$nom: Preu: $preu€, Increment Sucre: $teIncrementSucre"
    }

}