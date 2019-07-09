package com.ilh.tauas.rest

import com.ilh.tauas.BuildConfig
import com.ilh.tauas.model.RootDataModel
import retrofit.http.GET
import rx.Observable
import java.util.*

interface ApiService {
    @GET("detil_jadwal?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(
    ): Observable<RootDataModel>

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(
    ): Observable<RootDataModel>

}
