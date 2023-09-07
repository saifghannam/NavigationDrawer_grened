package com.example.listview.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.listview.Fragments.Home
import com.example.listview.Fragments.Profile
import com.example.listview.Fragments.Settings
import com.example.listview.databinding.FragmentProfileBinding

internal class MyAdapter(var context: Context,Fm:FragmentManager,var TotalTaps:Int):FragmentPagerAdapter(Fm) {
    override fun getCount(): Int {
        return TotalTaps
    }

    override fun getItem(position: Int): Fragment {
       return when(position){
           0->{Home()}
           1->{Profile()}
           2->{Settings()}
           else->getItem(position)

       }
    }
}