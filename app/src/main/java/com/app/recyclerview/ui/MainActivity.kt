package com.app.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.recyclerview.databinding.ActivityMainBinding
import com.app.recyclerview.ux.adapter.FoodAdapter
import com.app.recyclerview.ux.dataclass.Food

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodList = arrayListOf(

            Food(
                "Rice",
                "Parsabad-Moghan",
                "5",
                "12",
                30,
                4.7f,
                "https://m.economictimes.com/thumb/msid-87599672,width-1200,height-900,resizemode-4,imgsize-142188/rice.jpg"
            ),
            Food("Hamburger",
                "Tehran",
                "2", "8",
                79,
                3.9f,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Hamburger_%28black_bg%29.jpg/800px-Hamburger_%28black_bg%29.jpg"
            ),
            Food(
                "Cake",
                "Ardabil",
                "3",
                "12",
                999,
                5.0f,
                "https://www.tastingtable.com/img/gallery/classic-white-cake-recipe/intro-1653489158.jpg"
                ),
            Food(
                "Cup Cake",
                "Shiraz",
                "2",
                "12",
                800,
                4.78f,
                "https://foto.kontan.co.id/ZrwSiE8lSHWYphkll8x_w9IDpYI=/smart/filters:format(webp)/2021/09/17/1828014809p.jpg"
            ),
            Food(
                "Spaghetti",
                "Isfahan",
                "4",
                "9",
                6000,
                5.0f,
                "https://bakerbynature.com/wp-content/uploads/2013/12/IMG_5986-2-500x500.jpg"
            ),
            Food(
                "Fatir",
                "Meshgin",
                "2",
                "6",
                10000,
                5.0f,
                "https://ifpnews.com/wp-content/uploads/2020/04/fatir-9.jpg"
            ),
            Food(
                "Gorme Sabzi",
                "Ardabil",
                "1",
                "5",
                1900,
                5.0f,
                "https://cheetah-adventures.com/wp-content/uploads/2020/04/Ghormeh-Sabzi-Iranian-dishes-Iran-Culture.jpg"
            ),
            Food(
                "Khorest Morgh",
                "Shiraz",
                "3",
                "22",
                200,
                4.9f,
                "https://uniqop.com/wp-content/uploads/2020/06/Morgh-Stew-1-scaled.jpg"
            ),
            Food(
                "Kebab",
                "Tabriz",
                "3",
                "10",
                189,
                3.89f,
                "https://www.thedeliciouscrescent.com/wp-content/uploads/2018/10/Koobideh-Kabob.jpg"
            ),
            Food(
                "Halva",
                "Ardabil",
                "2",
                "13",
                209,
                5.0f,
                "https://www.researchgate.net/profile/Olim-Khojimatov/publication/305750851/figure/fig2/AS:774459631869953@1561656973697/Solid-halva-Samarkand-city-Uzbekistan-Sesame-halva-is-made-from-sugar-syrup-honey_Q640.jpg"
            ),
            Food(
                "Yogurt",
                "Tabriz",
                "1.3",
                "23",
                290,
                4.56f,
                "https://www.daringgourmet.com/wp-content/uploads/2021/01/How-to-Make-Yogurt-7-500x375.jpg"
            ),
            Food(
                "Shirini",
                "Ardabil",
                "2",
                "21",
                129,
                3.9f,
                "https://uniqop.com/wp-content/uploads/2020/06/Keshmeshi-1-scaled.jpg"
            )

        )

        val myAdapter = FoodAdapter( foodList, this )

        binding.recyclerViewMain.adapter = myAdapter

        binding.recyclerViewMain.layoutManager = LinearLayoutManager( this, RecyclerView.VERTICAL, false )

    }
}