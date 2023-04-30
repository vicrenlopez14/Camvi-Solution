package com.example.camvi.model.globales

import com.example.camvi.model.administradores.CamarografoItemData


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
    }
}