package com.example.week1_flo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class LockerPagerAdapter(fragmentActivity: FragmentActivity, private val albumList: ArrayList<Album>) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = albumList.size

    override fun createFragment(position: Int): Fragment {
        return SongListFragment(albumList)
    }
}
