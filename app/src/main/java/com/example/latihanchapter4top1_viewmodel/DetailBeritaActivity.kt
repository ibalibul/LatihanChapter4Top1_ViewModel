package com.example.latihanchapter4top1_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_berita.*
import kotlinx.android.synthetic.main.item_berita.*

class DetailBeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)

        var getDataPindah1 = intent.getSerializableExtra("Berita1") as ListBerita
        ivImgDetail.setImageResource(getDataPindah1.img)
        tvJDetailBerita.text = getDataPindah1.judulBerita
        tvJurnalisDBerita.text = getDataPindah1.jurnalis
        tvTanggalDetail.text = getDataPindah1.tanggalBerita
        tvIsiBerita.setText(getDataPindah1.isiBerita)

//        var getDataPindah2 = intent.getSerializableExtra("Berita2") as ListBerita
//        ivImgDetail.setImageResource(getDataPindah2.img)
//        tvJDetailBerita.text = getDataPindah2.judulBerita
//        tvJurnalisDBerita.text = getDataPindah2.jurnalis
//        tvTanggalDetail.text = getDataPindah2.tanggalBerita
//        tvIsiBerita.setText(getDataPindah2.isiBerita)
    }
}