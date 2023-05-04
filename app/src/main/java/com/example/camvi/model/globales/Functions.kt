package com.example.camvi.model.globales

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
    }
}