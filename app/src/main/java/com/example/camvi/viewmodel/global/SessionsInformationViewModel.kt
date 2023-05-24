package com.example.camvi.viewmodel.global

import androidx.lifecycle.ViewModel
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.model.globales.Session
import com.example.camvi.model.globales.SessionStatus

class SessionsInformationViewModel : ViewModel() {
    fun getSessionsByStatus(status: SessionStatus): List<Session> {
        return CamviFunctions.getSessionsByStatus(status)
    }

    fun getSessionById(id: Int): Session? {
        return CamviFunctions.getSessionById(id)
    }
}