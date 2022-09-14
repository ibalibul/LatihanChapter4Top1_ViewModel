package com.example.latihanchapter4top1_viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class BeritaAdapter(val listberita : ArrayList<ListBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {


    var onClik : ((ListBerita) -> Unit)? = null

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var JudulBerita = view.findViewById<TextView>(R.id.tvJudulBerita)
        var TanggalBerita = view.findViewById<TextView>(R.id.tvtglBerita)
        var Jurnalis = view.findViewById<TextView>(R.id.tvJurnalisBerita)
        var imgberita = view.findViewById<ImageView>(R.id.imgBerita)
        var card = view.findViewById<CardView>(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.JudulBerita.text = listberita[position].judulBerita
        holder.TanggalBerita.text = listberita[position].tanggalBerita
        holder.Jurnalis.text = listberita[position].jurnalis
        holder.imgberita.setImageResource(listberita[position].img)
        holder.card.setOnClickListener{
            onClik?.invoke(listberita[position])
        }
    }

    override fun getItemCount(): Int {
        return listberita.size
    }
}