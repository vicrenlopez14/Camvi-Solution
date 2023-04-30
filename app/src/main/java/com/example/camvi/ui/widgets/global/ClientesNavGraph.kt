package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.ui.screens.administradores.*

@Composable
fun ClientesNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = CamviScreen.Bienvenida.route) {
        composable(CamviScreen.Bienvenida.route) {

        }

        composable(CamviScreen.InicioDeSesion.route) {

        }

        composable(CamviScreen.CerrarSesion.route) {

        }

        composable(CamviScreen.Camarografos.route) {
            CamarografosScreen()
        }

        composable(CamviScreen.Sesiones.route) {
            SesionesAgendadasScreen()
        }

        composable(CamviScreen.Confirmaciones.route) {
            ConfirmacionesScreen()
        }

        composable(CamviScreen.Calificaciones.route) {
            CalificacionesScreen()
        }

        composable(CamviScreen.GaleriaDeFotos.route) {
            GaleriaDeFotosScreen()
        }

        composable(CamviScreen.GaleriaDeFotos.route) {
            GaleriaDeFotosScreen()
        }

        composable(CamviScreen.OlvideMiContrasena.route) {

        }

        composable(CamviScreen.ListaDeCamarografos.route) {

        }

        composable(CamviScreen.NuevaContrasena.route) {

        }

        composable(CamviScreen.CalificarSesion.route) {

        }

        composable(CamviScreen.VerificarCodigo.route) {

        }

        composable(CamviScreen.AgendarCita.route) {

        }

        composable(CamviScreen.AsignarCamarografo.route) {

        }

        composable(CamviScreen.AsignarCamarografoAdministradores.route) {

        }

        composable(CamviScreen.CamarografosDisponibles.route) {

        }

        composable(CamviScreen.CitasCliente.route) {

        }

        composable(CamviScreen.CrearFotografo.route) {

        }

        composable(CamviScreen.DetalleSesion.route) {

        }

        composable(CamviScreen.DetalleMisCitas.route) {

        }

        composable(CamviScreen.DetalleSesiones.route) {

        }

        composable(CamviScreen.EditarCamarografo.route) {

        }

        composable(CamviScreen.SesionesAgendadas.route) {

        }

        composable(CamviScreen.SubirFotografia.route) {

        }


        composable(CamviScreen.VerMasSesiones.route) {

        }

        composable(CamviScreen.VerMisCitas.route) {

        }

        composable(CamviScreen.VerFotografo.route) {

        }

        composable(CamviScreen.VerMasCamarografo.route) {

        }
    }
}