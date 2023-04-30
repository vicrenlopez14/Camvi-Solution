package com.example.camvi.ui.widgets.global

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class CamviScreen(
    val route: String,
    val title: String?,
    val icon: ImageVector?
) {
    object Bienvenida : CamviScreen("Bienvenida", "Bienvenida", Icons.Filled.Home)
    object InicioDeSesion : CamviScreen("InicioDeSesion", "InicioDeSesion", Icons.Filled.Home)
    object Registro : CamviScreen("Registro", "Registro", Icons.Filled.Home)

    // Screens for Inicio, Camarógrafos, Sesiones, Confirmaciones, Calificaciones, Galería de fotos and Cerrar Sesión
    object InicioAdministradores : CamviScreen("Inicio", "Inicio", Icons.Filled.Home)
    object Camarografos : CamviScreen("Camarografos", "Camarografos", Icons.Filled.Done)
    object Sesiones : CamviScreen("Sesiones", "Sesiones", Icons.Filled.Done)
    object Confirmaciones : CamviScreen("Confirmaciones", "Confirmaciones", Icons.Filled.Star)
    object Calificaciones :
        CamviScreen("Calificaciones", "Calificaciones", Icons.Filled.Done)

    object GaleriaDeFotos :
        CamviScreen("GaleriaDeFotos", "GaleriaDeFotos", Icons.Filled.Done)

    object CerrarSesion : CamviScreen("CerrarSesion", "CerrarSesion", Icons.Filled.Done)

    object OlvideMiContrasena :
        CamviScreen("OlvideMiContrasena", null, null)

    object ListaDeCamarografos :
        CamviScreen("ListaDeCamarografos", null, null)

    object NuevaContrasena :
        CamviScreen("NuevaContrasena", null, null)

    object CalificarSesion :
        CamviScreen("CalificarSesion", null, null)

    object VerificarCodigo :
        CamviScreen("VerificarCodigo", null, null)

    object AgendarCita :
        CamviScreen("AgendarCita", null, null)

    object AsignarCamarografo :
        CamviScreen("AsignarCamarografo", null, null)

    object AsignarCamarografoAdministradores :
        CamviScreen("AsignarCamarografoAdministradores", null, null)

    object CamarografosDisponibles :
        CamviScreen("CamarografosDisponibles", null, null)

    object CitasCliente :
        CamviScreen("CitasCliente", null, null)

    object CrearFotografo :
        CamviScreen("CrearFotografo", null, null)

    object DetalleSesion :
        CamviScreen("DetalleSesion", null, null)

    object DetalleMisCitas :
        CamviScreen("DetalleMisCitas", null, null)

    object DetalleSesiones :
        CamviScreen("DetalleSesiones", null, null)

    object EditarCamarografo :
        CamviScreen("EditarCamarografo", null, null)

    object SesionesAgendadas :
        CamviScreen("SesionesAgendadas", null, null)

    object SubirFotografia :
        CamviScreen("SubirFotografia", null, null)

    object VerFotografo :
        CamviScreen("VerFotografo", null, null)

    object VerMasCamarografo :
        CamviScreen("VerMasCamarografo", null, null)

    object VerMasSesiones :
        CamviScreen("VerMasSesiones", null, null)

    object VerMisCitas :
        CamviScreen("VerMisCitas", null, null)


}