package com.app.recyclerview.ux.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.recyclerview.R
import com.app.recyclerview.ux.dataclass.FoodData

class FoodAdapter( private val data: List<FoodData>): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {



    inner class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imgMain = itemView.findViewById<ImageView>(R.id.item_img_main)
        val txtCity = itemView.findViewById<TextView>(R.id.item_txt_city)
        val txtSubject = itemView.findViewById<TextView>(R.id.item_txt_subject)
        val txtPrice = itemView.findViewById<TextView>(R.id.item_txt_price)
        val txtDistance = itemView.findViewById<TextView>(R.id.item_txt_distance)
        val ratingBar = itemView.findViewById<RatingBar>(R.id.item_rating_main)


        fun bindData(position: Int) {

            txtSubject.text = data[position].txtSubject
            txtCity.text = data[position].txtCity
            txtPrice.text = data[position].txtPrice
            txtDistance.text = data[position].txtDistance
            ratingBar.rating = data[position].rating

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder( view )

    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {

        holder.bindData( position )

    }

    override fun getItemCount(): Int {

        return data.size

    }


}