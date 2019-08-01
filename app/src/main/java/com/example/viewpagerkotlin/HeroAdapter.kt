package com.example.viewpagerkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerkotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.listitem.view.*

class HeroAdapter (private val heroList :List<Hero>) : RecyclerView.Adapter<HeroHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        //inisialisasi layout
        return HeroHolder(LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false))
    }

    override fun getItemCount(): Int {
        //banyaknya data dalam list
        return heroList.size
        }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        //data apa yang mau ditampilkan
        holder.bindHero(heroList[position])
        }


}

class HeroHolder(view :View) : RecyclerView.ViewHolder(view){


    //deklarasi inisialisai view yg ada di listitem
    private val tvHero = view.txtItem
    private val imgHero = view.imgItem

    fun bindHero(hero: Hero) {
        //diset data nya ke textview dan imageviw
        tvHero.text = hero.nama
        Picasso.get().load(hero.gambar).into(imgHero)

        //kalau mau ada actionnya
        //karena extends ke view holder, view holder punya view yang bisa digunakan sekaligus




    }

}