package com.example.camvi.ui.state.administradores

import com.example.camvi.model.globales.Periodo

sealed class EstadoDeSesion(
    val num: Int,
    val description: String
) {
    class SesionesEnCurso(
        num: Int,
        description: String
    ) : EstadoDeSesion(num, description)

    class SesionesCompletadas(
        num: Int,
        description: String
    ) : EstadoDeSesion(num, description)

    class SesionesPendientes(
        num: Int,
        description: String
    ) : EstadoDeSesion(num, description)
}


data class AdministradoresDashboardUiState(
    val sesionesEnCurso: EstadoDeSesion.SesionesEnCurso = EstadoDeSesion.SesionesEnCurso(
        1,
        "Sesiones en curso"
    ),

    val sesionesCompletadas: EstadoDeSesion.SesionesCompletadas = EstadoDeSesion.SesionesCompletadas(
        1,
        "Sesiones completadas"
    ),

    val sesionesPendientes: EstadoDeSesion.SesionesPendientes = EstadoDeSesion.SesionesPendientes(
        1,
        "Sesiones pendientes"
    ),

    val periodOfTime: Periodo = Periodo.Hoy,

    val clientSatisfactionPercentage: Int = 0,

    val newSesions: Int = 0,

    val sesionsWithoutCamarographer: Int = 0,
)