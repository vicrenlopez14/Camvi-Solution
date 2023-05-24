package com.example.camvi.model.globales

import com.example.camvi.R

sealed class SessionStatus(
    val Name: String,
    val NaturalName: String,
    val ColorResource: Int
) {
    object EnProgreso :
        SessionStatus(
            Name = "En progreso",
            NaturalName = "Sesiones en progreso",
            ColorResource = R.color.RedError
        )

    object Pendiente :
        SessionStatus(
            Name = "Pendiente",
            NaturalName = "Sesiones pendientes",
            ColorResource = R.color.Yellow
        )

    object Finalizada :
        SessionStatus(
            Name = "Finalizado",
            NaturalName = "Sesiones finalizadas",
            ColorResource = R.color.GreenSuccess
        )
}