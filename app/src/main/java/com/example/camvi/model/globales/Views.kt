    package com.example.camvi.model.globales

import com.example.camvi.model.administradores.CamarografoItemData
import com.example.camvi.model.clientes.CitasClienteData
import java.sql.SQLException


    class CamviViews {
    companion object {
        private var connectSql = ConnectSql()

        fun vwListaDeCamarografos(): ArrayList<CamarografoItemData> {
            val listaCamarografos = ArrayList<CamarografoItemData>()

            try {
                val statement =
                    connectSql.dbConn()
                        ?.prepareStatement("SELECT * FROM vwListaDeCamarografos")

                val resultSet =
                    statement?.executeQuery()

                while (resultSet?.next() == true) {
                    listaCamarografos.add(
                        CamarografoItemData(
                             resultSet.getString("Nombre")
                        )
                    )
                }
            } catch (ex: Exception) {
                print(ex.message)
            }

            return listaCamarografos
        }

        fun obtenerEstadisticaSesionesEnCurso(): Pair<Int, String> {
            var resultado: Pair<Int, String> = Pair(0, "")

            try {
                val statement = connectSql.dbConn()?.prepareStatement("SELECT SesionesEnCurso, Mensaje FROM vwEstadisticaSesionesEnCurso")
                val resultSet = statement?.executeQuery()

                if (resultSet?.next() == true) {
                    val sesionesEnCurso = resultSet.getInt("SesionesEnCurso")
                    val mensaje = resultSet.getString("Mensaje")
                    resultado = Pair(sesionesEnCurso, mensaje)
                }
            } catch (ex: Exception) {
                println(ex.message)
            }

            return resultado
        }




    }
}