package com.example.viewpagerkotlin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_third.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ThirdFragment : Fragment() {

    val listHero = listOf(
        Hero(
            nama = "Spider-Man",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/9/30/538cd33e15ab7/standard_xlarge.jpg",
            keterangan = R.string.app_name
        ),
        Hero(
            nama = "Black Panther",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/1/c0/537ba2bfd6bab/standard_xlarge.jpg",
            keterangan = R.string.app_name
        ),
        Hero(
            nama = "Iron Man",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/6/a0/55b6a25e654e6/standard_xlarge.jpg",
            keterangan = R.string.app_name
        ),
        Hero(
            nama = "Dead Pool",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/5/c0/537ba730e05e0/standard_xlarge.jpg",
            keterangan = R.string.app_name
        ),
        Hero(
            nama = "Captain Marvel",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/c/10/537ba5ff07aa4/standard_xlarge.jpg",
            keterangan = R.string.app_name
        ),
        Hero(
            nama = "Ant Man",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/6/90/54ad7297b0a59/standard_xlarge.jpg",
            keterangan = R.string.app_name
        ),
        Hero(
            nama = "Spider-Man",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/9/30/538cd33e15ab7/standard_xlarge.jpg",
            keterangan = R.string.app_name
        ),
        Hero(
            nama = "Black Panther",
            gambar = "https://i.annihil.us/u/prod/marvel/i/mg/1/c0/537ba2bfd6bab/standard_xlarge.jpg",
            keterangan = R.string.app_name
        )
    )


        override fun onCreateView(inflater: LayoutInflater,
                                  container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_third, container, false) // returnnya di inisialisasi langsung

        // mengisi view

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)


            val listadapter = HeroAdapter(listHero)

            val rv = view.findViewById<RecyclerView>(R.id.recyclerView)

            rv.apply {
                //ini bentuknya sama kaya lisview
                //layoutManager = LinearLayoutManager(this@MainActivity)
                //bentuk sama kaya gridview
                layoutManager = GridLayoutManager(activity, 3)
                adapter = listadapter
            }
        }

    }

