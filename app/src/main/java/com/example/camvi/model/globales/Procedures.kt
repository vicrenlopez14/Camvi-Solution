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
            contacto: String,
            dui: String,
            correo: String,
            pass: String,

        ): Int {
            var exitoso: Int = 0

            try {
                val statement =
                    connectSql.dbConn()?.prepareStatement("EXEC spRegistrarCliente ?,?,?,?,?")
                statement?.setString(1, nombre)
                statement?.setString(2, contacto)
                statement?.setString(3, dui)
                statement?.setString(4, correo)
                statement?.setString(5, pass)

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


        //este esta conectado a la pantalla
        fun spRegistrarCamarografo(
            nombre: String,
            contacto: String,
            dui: String,
            correo: String,
            pass: String,

        ): Int {
            var resultado : Int = 0
            try {
                val statement = connectSql.dbConn()?.prepareStatement("EXEC spRegistrarCamarografo ?,?,?,?,?")
                statement?.setString(1, nombre)
                statement?.setString(2,contacto)
                statement?.setString(3,dui)
                statement?.setString(4, correo)
                statement?.setString(5,pass)

                val resultSet = statement?.executeQuery()
                while(resultSet?.next()==true){
                    resultado = resultSet.getInt("Result")
                }
            }
            catch (ex: SQLException){
                resultado = 0
            }
            catch (ex : Exception){
                print(ex.message)
            }

            return resultado
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
                val statement = connectSql.dbConn()?.prepareCall("{call spInsertarCalificacion ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?}")
                    //statement?.setInt(1,puntualidadFotografo)
                    //statement?.setInt(2, actitudFotografo)
                    statement?.setInt(3,desempenoFotografo)
                    statement?.setInt(4,profesionalismoFotografo)
                    statement?.setInt(5,presentacionPersonalFotografo)
                    statement?.setInt(6,servicioDeAtencion)
                    statement?.setInt(7, esperaDeRespuestas)
                    statement?.setInt(8,calidadDelProductoFinal)
                    statement?.setString(9,comentarios)
                    //statement?.setInt(10, clienteId)
                    //statement?.setInt(11,sesionId)

                val resultSet = statement?.executeQuery()
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
        fun spAgendarCita(
            titulo: String,
            fecha: String,
            horaInicio: String,
            horaFinal: String,
            lugar: String,
            nombreCamarografo:String,
            reservador: String,
            dui: String,
            telefono: String

        ): Int {
            var exitoso: Int = 0

            try{
                val statement =
                    connectSql.dbConn()?.prepareCall("{call spAgendarCita ?,?,?,?,?,?,?,?,?,?}")
                statement?.setString(1, titulo)
                statement?.setString(2, fecha)
                statement?.setString(3, horaInicio)
                statement?.setString(4, horaFinal)
                statement?.setString(5, lugar)
                statement?.setString(6, nombreCamarografo)
                statement?.setString(7, reservador)
                statement?.setString(8,lugar)
                statement?.setString(9, dui)
                statement?.setString(10, telefono)

                val resultSet = statement?.executeQuery()
                while(resultSet?.next() == true)
                {
                    exitoso = resultSet.getInt("Result")
                }
            } catch (ex: SQLException){
        exitoso = 0
    } catch (ex: Exception){
        print(ex.message)
    }
    return exitoso
    }
    }
}