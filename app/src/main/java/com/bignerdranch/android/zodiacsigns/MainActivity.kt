package com.bignerdranch.android.zodiacsigns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ZodiacSignAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)

        val zodiacSigns = listOf(
            ZodiacSign("Aries", "March 21 - April 19"),
            ZodiacSign("Taurus", "April 20 - May 20"),
            ZodiacSign("Gemini", "May 21 - June 20"),
            ZodiacSign("Cancer", "June 21 - July 22"),
            ZodiacSign("Leo", "July 23 - August 22"),
            ZodiacSign("Virgo", "August 23 - September 22"),
            ZodiacSign("Libra", "September 23 - October 22"),
            ZodiacSign("Scorpio", "October 23 - November 21"),
            ZodiacSign("Sagittarius", "November 22 - December 21"),
            ZodiacSign("Capricorn", "December 22 - January 19"),
            ZodiacSign("Aquarius", "January 20 - February 18"),
            ZodiacSign("Pisces", "February 19 - March 20")
        )

        adapter = ZodiacSignAdapter(zodiacSigns)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}