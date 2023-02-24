package com.bignerdranch.android.zodiacsigns

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ZodiacSignAdapter(private val zodiacSigns: List<ZodiacSign>) :
    RecyclerView.Adapter<ZodiacSignAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.zodiac_sign_name)
        private val datesTextView: TextView = itemView.findViewById(R.id.zodiac_sign_dates)

        fun bind(zodiacSign: ZodiacSign) {
            nameTextView.text = zodiacSign.name
            datesTextView.text = zodiacSign.dates
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.zodiac_sign_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(zodiacSigns[position])
    }

    override fun getItemCount(): Int {
        return zodiacSigns.size
    }
}
