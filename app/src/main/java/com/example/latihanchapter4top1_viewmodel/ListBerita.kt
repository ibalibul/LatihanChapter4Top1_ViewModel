package com.example.latihanchapter4top1_viewmodel

import java.io.Serializable

data class ListBerita (
        val judulBerita : String,
        val tanggalBerita : String,
        val jurnalis : String,
        val img : Int,
        val isiBerita : Int,

): Serializable