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

        fun fnVerSesionDetalle(idSesion: Int): ArrayList<Sesiones>{

            val listaSesiones = ArrayList<Sesiones>()
            try {

                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT * FROM fnVerMasSesion(?)")
                   // statement?.setInt(1, idSesion)

                    val resultSet = statement?.executeQuery()

                    while (resultSet?.next()== true){
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
            }catch (e: SQLException){

            }
            return listaSesiones
        }





    }
}