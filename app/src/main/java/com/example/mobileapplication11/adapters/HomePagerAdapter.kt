package com.example.mobileapplication11.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mobileapplication11.fragment.HomePostsFragment
import com.example.mobileapplication11.fragment.StoriesFragment

class HomePagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> StoriesFragment()
            1 -> HomePostsFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}
