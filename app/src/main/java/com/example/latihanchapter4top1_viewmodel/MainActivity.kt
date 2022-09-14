package com.example.latihanchapter4top1_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Berita News

        val listBerita = arrayListOf(
            ListBerita("Bocah Pelajar Tawuran","5Januari2020","TempoTempo",R.drawable.wew),
            ListBerita("Harga BBM Naik","18 Februari 2020","Lambai-Lambai",R.drawable.wew),
            ListBerita("MalingMotor","18 Februari 2020","TempoTempo",R.drawable.wew),
            ListBerita("Hacker Meretas Data Penting","18 Februari 2020","Lambai-curhat",R.drawable.wew),
            ListBerita("MalingKambing","18 Februari 2020","Waktu.com",R.drawable.wew),

        )
//        Membuat Adapter
        val beritaSatu = BeritaAdapter(listBerita)
        val lmberitaSatu = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvBerita.layoutManager =lmberitaSatu
        rvBerita.adapter = beritaSatu

//        Berita Rekomendasi

        val listBeritaRekomen = arrayListOf(
            ListBerita("MalingMotor","18 Februari 2020","Lambai-Lambai",R.drawable.wew),
            ListBerita("MalingKambing","18 Februari 2020","Lambai-Lambai",R.drawable.wew),
            ListBerita("MalingKambing","18 Februari 2020","Lambai-Lambai",R.drawable.wew),
            ListBerita("MalingKambing","18 Februari 2020","Lambai-Lambai",R.drawable.wew),
            ListBerita("MalingKambing","18 Februari 2020","Lambai-Lambai",R.drawable.wew),
        )
        val beritaDua = BeritaAdapter(listBeritaRekomen)
        val lmberitaRekomen = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvBerita2.layoutManager = lmberitaRekomen
        rvBerita2.adapter = beritaDua

    }
}