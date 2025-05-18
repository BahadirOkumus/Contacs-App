package com.example.kisileruygulamasi.retrofit

class ApiUtils {
    companion object {

        //http://kasimadalan.pe.hu/kisiler/tum_kisiler.php
        //http://kasimadalan.pe.hu/ -> base url
        //kisiler/tum_kisiler.php  -> api url
        val BASE_URL ="http://kasimadalan.pe.hu/"

        fun getKisilerDao() : KisilerDao {
            return RetrofitClient.getClient(BASE_URL).create(KisilerDao::class.java)
        }

    }
}