package com.example.camvi.model.globales

sealed class Periodo(val Name: String) {
    object Hoy : Periodo("Hoy")
    object Semana : Periodo("Semana")
    object Mes : Periodo("Mes")
}