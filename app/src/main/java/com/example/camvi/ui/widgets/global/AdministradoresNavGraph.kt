package com.example.camvi.ui.widgets.global

import android.view.LayoutInflater
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.databinding.FragmentAgendarCitaBinding
import com.example.camvi.databinding.FragmentAsignarCamarografoAdminBinding
import com.example.camvi.databinding.FragmentAsignarCamarografoBinding
import com.example.camvi.databinding.FragmentCamarografosDisponiblesBinding
import com.example.camvi.databinding.FragmentCitasClienteBinding
import com.example.camvi.databinding.FragmentCrearFotografoBinding
import com.example.camvi.databinding.FragmentDetalleSesionBinding
import com.example.camvi.databinding.FragmentDetallesMisCitasBinding
import com.example.camvi.databinding.FragmentDetallesSesionesBinding
import com.example.camvi.databinding.FragmentEditarCamarografoBinding
import com.example.camvi.databinding.FragmentForgetPasswordBinding
import com.example.camvi.databinding.FragmentListaCamarografosBinding
import com.example.camvi.databinding.FragmentLoginBinding
import com.example.camvi.databinding.FragmentNewPasswordBinding
import com.example.camvi.databinding.FragmentPrincipalBinding
import com.example.camvi.databinding.FragmentQualifySessionBinding
import com.example.camvi.databinding.FragmentRegistroBinding
import com.example.camvi.databinding.FragmentSesionesAgendadasBinding
import com.example.camvi.databinding.FragmentSubirFotografiaBinding
import com.example.camvi.databinding.FragmentVerFotografoBinding
import com.example.camvi.databinding.FragmentVerMasCamarografoBinding
import com.example.camvi.databinding.FragmentVerMasSesionesBinding
import com.example.camvi.databinding.FragmentVerMisCitasBinding
import com.example.camvi.databinding.FragmentVerifyCodeBinding
import com.example.camvi.ui.screens.administradores.*
import com.example.camvi.utils.FragmentScreen

@Composable
fun AdministradoresNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = CamviScreen.Bienvenida.route) {
        composable(CamviScreen.Bienvenida.route) {
            HomeScreen()
        }

        composable(CamviScreen.InicioDeSesion.route) {
            FragmentScreen { context, parent ->
                FragmentLoginBinding.inflate(LayoutInflater.from(context), parent, true).root
            }
        }

        composable(CamviScreen.Registro.route) {
            FragmentScreen { context, parent ->
                FragmentRegistroBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.CerrarSesion.route) {
            FragmentScreen { context, parent ->
                FragmentPrincipalBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
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
            FragmentScreen { context, parent ->
                FragmentForgetPasswordBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.ListaDeCamarografos.route) {
            FragmentScreen { context, parent ->
                FragmentListaCamarografosBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.NuevaContrasena.route) {
            FragmentScreen { context, parent ->
                FragmentNewPasswordBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.CalificarSesion.route) {
            FragmentScreen { context, parent ->
                FragmentQualifySessionBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.VerificarCodigo.route) {
            FragmentScreen { context, parent ->
                FragmentVerifyCodeBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.AgendarCita.route) {
            FragmentScreen { context, parent ->
                FragmentAgendarCitaBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.AsignarCamarografo.route) {
            FragmentScreen { context, parent ->
                FragmentAsignarCamarografoBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.AsignarCamarografoAdministradores.route) {
            FragmentScreen { context, parent ->
                FragmentAsignarCamarografoAdminBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.CamarografosDisponibles.route) {
            FragmentScreen { context, parent ->
                FragmentCamarografosDisponiblesBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.CitasCliente.route) {
            FragmentScreen { context, parent ->
                FragmentCitasClienteBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.CrearFotografo.route) {
            FragmentScreen { context, parent ->
                FragmentCrearFotografoBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.DetalleSesion.route) {
            FragmentScreen { context, parent ->
                FragmentDetalleSesionBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.DetalleMisCitas.route) {
            FragmentScreen { context, parent ->
                FragmentDetallesMisCitasBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.DetalleSesiones.route) {
            FragmentScreen { context, parent ->
                FragmentDetallesSesionesBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.EditarCamarografo.route) {
            FragmentScreen { context, parent ->
                FragmentEditarCamarografoBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.SesionesAgendadas.route) {
            FragmentScreen { context, parent ->
                FragmentSesionesAgendadasBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.SubirFotografia.route) {
            FragmentScreen { context, parent ->
                FragmentSubirFotografiaBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root

            }
        }

        composable(CamviScreen.VerMasSesiones.route) {
            FragmentScreen { context, parent ->
                FragmentVerMasSesionesBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.VerMisCitas.route) {
            FragmentScreen { context, parent ->
                FragmentVerMisCitasBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.VerFotografo.route) {
            FragmentScreen { context, parent ->
                FragmentVerFotografoBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }

        composable(CamviScreen.VerMasCamarografo.route) {
            FragmentScreen { context, parent ->
                FragmentVerMasCamarografoBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    true
                ).root
            }
        }
    }
}