package com.example.camvi.model.globales


import java.sql.SQLException

class CamviProcedures {
    companion object {
        private var connectSql = ConnectSql()

        fun spCrearAdministradores(
            nombre: String,
            correo: String,
            pass: String,
            contacto: String,
            dui: String
        ): Int {
            var exitoso: Int = 0

            try {
                val statement =
                    connectSql.dbConn()?.prepareCall("{call spCrearAdministradores}")
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


        fun spCrearCamarografo(
            nombre: String,
            correo: String,
            pass: String,
            contacto: String,
            dui: String
        ): Int {
            var exitoso: Int = 0

            try {
                val statement =
                    connectSql.dbConn()?.prepareCall("{call spCrearCamarografo}")
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

        fun spInsertarCalificacion(
            puntualidadFotografo: Int,
            actitudFotografo:Int,
            desempenoFotografo: Int,
            profesionalismoFotografo: Int,
            presentacionPersonalFotografo: Int,
            servicioDeAtencion: Int,
            esperaDeRespuestas: Int,
            calidadDelProductoFinal: Int,
            comentarios: String,
            //clienteId: Int,
            //sesionId: Int
        ): Int{
            var exitoso: Int = 0

            try {
                val statement =
                    connectSql.dbConn()?.prepareCall("{call spInsertarCalificacion ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?}")
                    //statement?.setInt(1,puntualidadFotografo)
                    statement?.setInt(2, actitudFotografo)
                    statement?.setInt(3,desempenoFotografo)
                    statement?.setInt(4,profesionalismoFotografo)
                    statement?.setInt(5,presentacionPersonalFotografo)
                    statement?.setInt(6,servicioDeAtencion)
                    statement?.setInt(7, esperaDeRespuestas)
                    statement?.setInt(8,calidadDelProductoFinal)
                    statement?.setString(9,comentarios)
                    //statement?.setInt(10, clienteId)
                    //statement?.setInt(11,sesionId)

                val resultSet = statement?.executeQuery();
                while (resultSet?.next() == true)
                {
                    exitoso = resultSet.getInt("Result")
                }

            }
            catch (ex: SQLException) {
                exitoso = 0
            } catch (ex: Exception) {
                print(ex.message)
            }
            return exitoso
        }





    }


}