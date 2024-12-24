package com.example.mobileapplication11.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.mobileapplication11.R
import com.example.mobileapplication11.home.HomePagerAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val viewPager: ViewPager2 = view.findViewById(R.id.homeViewPager)
        viewPager.adapter = HomePagerAdapter(this)

        return view
    }
}
