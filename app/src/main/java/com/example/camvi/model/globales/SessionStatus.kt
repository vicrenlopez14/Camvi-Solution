package com.example.camvi.model.globales

import com.example.camvi.R

sealed class SessionStatus(val Name: String, val ColorResource: Int) {
    object EnProgreso : SessionStatus("En progreso", ColorResource = R.color.RedError)
    object Finalizada : SessionStatus("Finalizada", ColorResource = R.color.GreenSuccess)
    object Pendiente : SessionStatus("Pendiente", ColorResource = R.color.Yellow)
}