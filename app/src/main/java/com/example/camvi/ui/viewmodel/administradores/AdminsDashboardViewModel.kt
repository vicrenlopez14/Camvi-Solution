package com.example.camvi.ui.viewmodel.administradores

import androidx.lifecycle.ViewModel
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.model.globales.CamviViews
import com.example.camvi.model.globales.Periodo
import com.example.camvi.ui.state.administradores.AdministradoresDashboardUiState
import com.example.camvi.ui.state.administradores.EstadoDeSesion
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AdminsDashboardViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(AdministradoresDashboardUiState())

    val uiState: StateFlow<AdministradoresDashboardUiState> = _uiState.asStateFlow()

    private lateinit var sesionesEnCurso: EstadoDeSesion.SesionesEnCurso
    private var selectedPeriodOfTime: Periodo = Periodo.Hoy

    private var clientSatisfactionPercentage: Int = 0
    private var periodNewSessions: Int = 0
    private var sesionsWithoutCamarographer: Int = 0

    init {
        obtenerEstadosDeSesiones()
        obtenerEstadisticas()
    }

    private fun obtenerEstadosDeSesiones() {
        val EstadisticaSesionesEnCurso = CamviViews.obtenerEstadisticaSesionesEnCurso()

        sesionesEnCurso = EstadoDeSesion.SesionesEnCurso(
            num = EstadisticaSesionesEnCurso.first,
            description = EstadisticaSesionesEnCurso.second
        )

        _uiState.value = _uiState.value.copy(
            sesionesEnCurso = sesionesEnCurso
        )
    }

    private fun obtenerEstadisticas() {
        clientSatisfactionPercentage =
            CamviFunctions.getClientSatisfactionPercentage(selectedPeriodOfTime.Name)
        periodNewSessions = CamviFunctions.getSessionCountByPeriod(selectedPeriodOfTime.Name)
        sesionsWithoutCamarographer =
            CamviFunctions.getUnassignedSessionCount()

        _uiState.value = _uiState.value.copy(
            clientSatisfactionPercentage = clientSatisfactionPercentage,
            newSesions = periodNewSessions,
            sesionsWithoutCamarographer = sesionsWithoutCamarographer
        )
    }

    fun ChangePeriodOfTime(periodo: Periodo) {
        selectedPeriodOfTime = periodo

        _uiState.update { currentState ->
            currentState.copy(
                periodOfTime = selectedPeriodOfTime
            )
        }
    }


}
