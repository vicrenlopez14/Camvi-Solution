package com.example.camvi.model.globales

import com.example.camvi.model.administradores.Sesiones
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


    }
}