package com.example.camvi.model.globales

import com.example.camvi.model.administradores.Sesiones
import com.example.camvi.model.clientes.CitasClienteData
import com.example.camvi.model.clientes.CitasClienteDetalleData
import com.example.camvi.ui.state.administradores.clientes.ClientesVerMasCitaState
import java.sql.SQLException

class CamviFunctions {
    companion object {
        private var connectSql = ConnectSql()

        fun fnIniciarSesion(correo: String, pass: String): Int {
            var tipoUsuario: Int = 0

            try {
                val statement =
                    connectSql.dbConn()
                        ?.prepareStatement("SELECT dbo.fnIniciarSesion(?, ?) AS TipoUsuario")
                statement?.setString(1, correo)
                statement?.setString(2, pass)

                val resultSet =
                    statement?.executeQuery()

                while (resultSet?.next() == true) {
                    tipoUsuario = resultSet.getInt("TipoUsuario")
                }
            } catch (ex: SQLException) {
                tipoUsuario = 0
            } catch (ex: Exception) {
                print(ex.message)
            }

            return tipoUsuario
        }

        fun fnVerSesionDetalle(idSesion: Int): ArrayList<Sesiones> {

            val listaSesiones = ArrayList<Sesiones>()
            try {

                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT * FROM fnVerMasSesion(?)")
                // statement?.setInt(1, idSesion)

                val resultSet = statement?.executeQuery()

                while (resultSet?.next() == true) {
                    listaSesiones.add(
                        Sesiones(
                            resultSet.getString("s.titulo"),
                            resultSet.getString("s.detalles"),
                            resultSet.getString("s.lugar"),
                            resultSet.getDate("s.fechaEvento"),
                            resultSet.getTime("s.horaInicio"),
                            resultSet.getTime("s.horaFinalizacion"),
                            resultSet.getString(" u.nombre"),
                            resultSet.getString("u.contacto"),
                            resultSet.getString("u.dui")

                        )
                    )
                }
            } catch (e: SQLException) {

            }
            return listaSesiones
        }

        fun getClientSatisfactionPercentage(periodo: String): Int {
            val connection = connectSql.dbConn()
            val statement =
                connection?.prepareStatement("SELECT dbo.GetClientSatisfactionPercentage(?)")
            statement?.setString(1, periodo)

            val resultSet = statement?.executeQuery()

            if (resultSet?.next() == true) {
                return resultSet.getInt(1)
            }

            return 0
        }

        fun getSessionCountByPeriod(periodo: String): Int {
            var sessionCount = 0

            try {
                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT dbo.GetInsertedSessionsCount(?)")
                statement?.setString(1, periodo)

                val resultSet = statement?.executeQuery()

                if (resultSet?.next() == true) {
                    sessionCount = resultSet.getInt(1)
                }
            } catch (e: SQLException) {
                // Handle any exceptions
            }

            return sessionCount
        }

        fun getUnassignedSessionCount(): Int {
            var unassignedSessionCount = 0

            try {
                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT dbo.GetUnassignedSessionCount()")

                val resultSet = statement?.executeQuery()

                if (resultSet?.next() == true) {
                    unassignedSessionCount = resultSet.getInt(1)
                }
            } catch (e: SQLException) {
                // Handle any exceptions
            }

            return unassignedSessionCount
        }

        fun fnListaCitasClientes(idUsuario: Int): ArrayList<CitasClienteData>{
            val listaCitas = ArrayList<CitasClienteData>()

            try{
                val statement = connectSql.dbConn()?.
                prepareStatement("SELECT * FROM fnCitasCliente(?)")
                statement?.setInt(1,idUsuario)

                val resultSet= statement?.executeQuery()

                while (resultSet?.next() == true){
                    listaCitas.add(
                        CitasClienteData(
                            resultSet.getInt("idSesion"),
                            resultSet.getString("titulo"),
                            resultSet.getString("nombre"),
                            resultSet.getString("fechaEvento")
                        )
                    )
                }

            }catch (ex: Exception){
                println(ex.message)
            }
            return listaCitas
        }


        fun fnCitasClienteDetalle(idSesion: Int): ArrayList <ClientesVerMasCitaState>{
            val listasCitaDetalle = ArrayList<ClientesVerMasCitaState>()
            try{
                val statement = connectSql.dbConn()?.prepareStatement("SELECT * FROM fnSesionesClientesDetalle(?)")
                statement?.setInt(1,idSesion)

                val resultSet = statement?.executeQuery()

                while (resultSet?.next() == true){
                    listasCitaDetalle.add(
                        ClientesVerMasCitaState(
                            resultSet.getString("titulo"),
                            resultSet.getString("detalle"),
                            resultSet.getString("lugar"),
                            resultSet.getString("fechaEvento"),
                            resultSet.getString("horaInicio"),
                            resultSet.getString("horaFinalizacion"),
                            resultSet.getString("nombre"),
                            resultSet.getString("contacto"),
                            resultSet.getString("dui"),
                            resultSet.getString("Nombre del fotografo") ///aca me quede antes de pasar a fase 3
                        )
                    )
                }
            }catch (ex : Exception){
                println(ex.message)
            }
            return listasCitaDetalle
        }


    }
}