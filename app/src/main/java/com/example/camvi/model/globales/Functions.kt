package com.example.camvi.model.globales

import com.example.camvi.model.administradores.Sesiones
import com.example.camvi.model.camarografos.CamarografosSesionesData
import com.example.camvi.model.clientes.CitasClienteData
import com.example.camvi.model.clientes.CitasClienteDetalleData
import com.example.camvi.ui.state.administradores.clientes.VerMasCamarografoState
import java.sql.SQLException

class CamviFunctions {
    companion object {
        private var connectSql = ConnectSql()

        fun getUserByEmail(email: String): UserBasicInformation? {
            val query = "SELECT * FROM fnGetUserByEmail(?)"

            try {
                val statement = connectSql.dbConn()?.prepareStatement(query)
                statement?.setString(1, email)

                val resultSet = statement?.executeQuery()

                if (resultSet?.next() == true) {
                    return UserBasicInformation(
                        id = resultSet.getInt("idUsuario"),
                        name = resultSet.getString("nombre"),
                        email = resultSet.getString("correo"),
                        password = resultSet.getString("pass"),
                    )
                }
            } catch (e: SQLException) {
                // Handle any exceptions
            }

            return null
        }


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

        fun fnListaCitasClientes(idUsuario: Int): ArrayList<CitasClienteDetalleData> {
            val listaCitas = ArrayList<CitasClienteDetalleData>()

            try {
                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT * FROM fnCitasCliente(?)")
                statement?.setInt(1, idUsuario)

                val resultSet = statement?.executeQuery()

                while (resultSet?.next() == true) {
                    listaCitas.add(
                        CitasClienteDetalleData(
                            idSesion = resultSet.getInt("idSesion"),
                            titulo = resultSet.getString("titulo"),
                           nombre= resultSet.getString("nombre"),
                            fecha = resultSet.getString("fechaEvento"),
                        )
                    )
                }

            } catch (ex: Exception) {
                println(ex.message)
            }
            return listaCitas
        }

        fun getSessionsByStatus(status: SessionStatus): ArrayList<Session> {
            val sessions = ArrayList<Session>()

            try {
                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT * FROM fnSesionesFinalizadas(?)")
                statement?.setString(1, status.Name)

                val resultSet = statement?.executeQuery()

                while (resultSet?.next() == true) {
                    sessions.add(
                        Session(
                            id = resultSet.getInt("idSesion"),
                            titulo = resultSet.getString("titulo"),
                            detalles = resultSet.getString("detalles"),
                            fotoGaleria = resultSet.getBytes("foto"),
                            direccionEvento = resultSet.getString("direccionEvento"),
                            fechaEvento = resultSet.getDate("fechaEvento").toString(),
                            horaInicio = resultSet.getTime("horaInicio").toString(),
                            horaFinalizacion = resultSet.getTime("horaFinalizacion").toString(),
                            lugar = resultSet.getString("lugar"),
                            confirmada = resultSet.getBoolean("confirmada"),
                            cancelada = resultSet.getBoolean("cancelada"),
                            idFotografo = resultSet.getInt("idFotografo"),
                            idCliente = resultSet.getInt("idCliente"),
                            fechaCreacion = resultSet.getDate("fechaDeCreacion").toString(),
                            realizacion = resultSet.getString("realizacion").toString(),
                        )
                    )
                }
            } catch (ex: SQLException) {
                // Handle the exception
            }

            return sessions
        }

        fun getSessionById(sessionId: Int): Session? {
            var session: Session? = null

            try {
                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT * FROM fnGetSessionById(?)")
                statement?.setInt(1, sessionId)

                val resultSet = statement?.executeQuery()

                if (resultSet?.next() == true) {
                    session = Session(
                        id = resultSet.getInt("id"),
                        titulo = resultSet.getString("titulo"),
                        detalles = resultSet.getString("detalles"),
                        fotoGaleria = resultSet.getBytes("fotoGaleria"),
                        direccionEvento = resultSet.getString("direccionEvento"),
                        fechaEvento = resultSet.getString("fechaEvento"),
                        horaInicio = resultSet.getString("horaInicio"),
                        horaFinalizacion = resultSet.getString("horaFinalizacion"),
                        lugar = resultSet.getString("lugar"),
                        confirmada = resultSet.getBoolean("confirmada"),
                        cancelada = resultSet.getBoolean("cancelada"),
                        idFotografo = resultSet.getInt("idFotografo"),
                        fechaCreacion = resultSet.getString("fechaCreacion"),
                        realizacion = resultSet.getString("realizacion"),
                        nombreCliente = resultSet.getString("clienteNombre"),
                        nombreFotografo = resultSet.getString("fotografoNombre")
                    )
                }
            } catch (ex: SQLException) {
                // Handle the exception
            }

            return session
        }


        fun fnCitasClienteDetalle(idSesion: Int): CitasClienteDetalleData? {
            var detalleData: CitasClienteDetalleData? = null

            try{
                val statement = connectSql.dbConn()?.prepareStatement("SELECT * FROM fnSesionesClientesDetalle(?)")
                statement?.setInt(1,idSesion)

                val resultSet = statement?.executeQuery()

                while (resultSet?.next() == true){
                    detalleData= CitasClienteDetalleData(
                            titulo = resultSet.getString("titulo"),
                            detalle = resultSet.getString("detalle"),
                            lugar = resultSet.getString("lugar"),
                            fecha = resultSet.getString("fechaEvento"),
                            horaIni = resultSet.getString("horaInicio"),
                            horaFinali = resultSet.getString("horaFinalizacion"),
                            nombre = resultSet.getString("nombre"),
                            contacto = resultSet.getString("contacto"),
                            dui= resultSet.getString("dui"),
                            fotografo = resultSet.getString("Nombre del fotografo") ///aca me quede antes de pasar a fase 3
                    )
                }
            } catch (ex: Exception) {
                println(ex.message)
            }
            return detalleData
        }

        fun fnVerMasCamarografo(idCamarografo: Int): ArrayList<VerMasCamarografoState> {
            val VerMasCamarografo = ArrayList<VerMasCamarografoState>()
            try {
                val statement =
                    connectSql.dbConn()?.prepareStatement("SELECT * from fnVerMasCamarografo(?)")
                statement?.setInt(1, idCamarografo)

                val resultSet = statement?.executeQuery()

                while (resultSet?.next() == true) {
                    VerMasCamarografo.add(
                        VerMasCamarografoState(
                            resultSet.getString("nombre"),
                            resultSet.getString("correo"),
                            resultSet.getString("acercaDe"),
                            resultSet.getString("descripcionCorta"),
                            resultSet.getString("tituloFormacion"),
                            resultSet.getString("imagen")
                        )
                    )
                }
            } catch (ex: Exception) {
                println(ex.message)
            }
            return VerMasCamarografo
        }

        fun fnSesionesLista(idUsuario: Int) : ArrayList<CamarografosSesionesData>{
            val listaSesiones = ArrayList<CamarografosSesionesData>()

            try {
                val statement =
                        connectSql.dbConn()?.prepareStatement("SELECT * FROM fnSesionesCamarografos(?)")
                statement?.setInt(1, idUsuario)

                val resultSet=statement?.executeQuery()

                while (resultSet?.next()== true){
                    listaSesiones.add(
                        CamarografosSesionesData(
                            idSesion = resultSet.getInt("idSesion"),
                            titulo = resultSet.getString("titulo"),
                            //nombreFotografo= resultSet.getString("nombre"),
                            //fechaEvento = resultSet.getString("fechaEvento")

                        )
                    )
                }

            }
            catch (ex: Exception){

            }
            return listaSesiones

        }

    }
}