package com.example.camvi.model.globales


import java.sql.SQLException

class CamviProcedures {
    companion object {
        private var connectSql = ConnectSql()

        fun spRegistrarCliente(
            nombre: String,
            correo: String,
            pass: String,
            contacto: String,
            dui: String
        ): Int {
            var exitoso: Int = 0

            try {
                val statement =
                    connectSql.dbConn()?.prepareCall("{call spRegistrarCliente ?, ?, ?, ?, ?}")
                statement?.setString(1, nombre)
                statement?.setString(2, correo)
                statement?.setString(3, pass)
                statement?.setString(4, contacto)
                statement?.setString(5, dui)

                val resultSet =
                    statement?.executeQuery()

                while (resultSet?.next() == true) {
                    exitoso = resultSet.getInt("Result")
                }
            } catch (ex: SQLException) {
                exitoso = 0
            } catch (ex: Exception) {
                print(ex.message)
            }

            return exitoso
        }

    }


}