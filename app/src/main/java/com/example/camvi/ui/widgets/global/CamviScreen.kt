package com.example.camvi.ui.widgets.global

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class CamviScreen(
    val route: String,
    val title: String?,
    val icon: ImageVector?
) {
    object Bienvenida : CamviScreen("Bienvenida", "Bienvenida", Icons.Filled.Home)
    object InicioDeSesion : CamviScreen("InicioDeSesion", "InicioDeSesion", Icons.Filled.Home)
    object Registro : CamviScreen("Registro", "Registro", Icons.Filled.Home)
}

sealed class AdministradoresScreen(
    route: String,
    title: String?,
    icon: ImageVector?
) :
    CamviScreen(route, title, icon) {
    object InicioAdministradores :
        AdministradoresScreen(
            "AdministradoresScreen",
            "Inicio",
            Icons.Filled.Home
        )

    object CamarografosAdministradores :
        AdministradoresScreen(
            "CamarografosAdministradores",
            "Camarografos",
            Icons.Filled.Done
        )

    object SesionesAdministradores :
        AdministradoresScreen(
            "SesionesAdministradores",
            "Sesiones",
            Icons.Filled.Done
        )

    object ConfirmacionesAdministradores : AdministradoresScreen(
        "ConfirmacionesAdministradores",
        "Confirmaciones",
        Icons.Filled.Done
    )

    object CalificacionesAdministradores : AdministradoresScreen(
        "CalificacionesAdministradores",
        "Calificaciones",
        Icons.Filled.Done
    )

    object GaleriaDeFotosAdministradores : AdministradoresScreen(
        "GaleriaDeFotosAdministradores",
        "Galeria de fotos",
        Icons.Filled.Done
    )

    object SesionesSinCamarografosAdministradores : AdministradoresScreen(
        "SesionesSinCamarografosAdministradores",
        "Sesiones sin camarografos",
        null
    )

    object AsignarCamarografoAdministradores : AdministradoresScreen(
        "AsignarCamarografoAdministradores",
        "Asignar camarografo",
        null
    )

    object SesionesAgendadasAdministradores : AdministradoresScreen(
        "SesionesAgendadasAdministradores",
        "Sesiones agendadas",
        null
    )

    object SubirFotografiasAdministradores : AdministradoresScreen(
        "SubirFotografiasAdministradores",
        "Subir fotografías ",
        null
    )


}

sealed class CamarografosScreen(
    route: String, title: String?, icon: ImageVector?
) :
    CamviScreen(route, title, icon) {
    object InicioCamarografos : CamarografosScreen(
        "Inicio",
        "Inicio",
        Icons.Filled.Home
    )

    object SesionesCamarografos : CamarografosScreen(
        "Sesiones",
        "Sesiones",
        Icons.Filled.Done
    )

    object NotificacionesCamarografos :
        CamarografosScreen(
            "Notificaciones",
            "Notificaciones",
            Icons.Filled.Done
        )
}

sealed class ClientesScreen(
    route: String,
    title: String?,
    icon: ImageVector?
) :
    CamviScreen(route, title, icon) {
    object InicioClientes : ClientesScreen("InicioClientes", "Inicio", Icons.Filled.Home)

    object SesionesClientes : ClientesScreen("SesionesClientes", "Sesiones", Icons.Filled.Done)

    object NotificacionesClientes :
        ClientesScreen("NotificacionesClientes", "Notificaciones", Icons.Filled.Done)

    object CalificanosClientes :
        ClientesScreen("CalificanosClientes", "Calificanos", Icons.Filled.Done)
}

