package com.example.week1_flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week1_flo.databinding.FragmentLockerBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LockerFragment : Fragment() {

    lateinit var binding: FragmentLockerBinding
    private var albumDatas = ArrayList<Album>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLockerBinding.inflate(inflater, container, false)


        //데이터 리스트 생성 더미 데이터
        albumDatas.apply {
            add(Album("Butter", "BTS", R.drawable.img_album_exp))
            add(Album("Lilac", "IU", R.drawable.img_album_exp2))
            add(Album("Next Level", "AESPA", R.drawable.img_album_exp3))
            add(Album("Boy with Luv", "BTS", R.drawable.img_album_exp4))
            add(Album("BBoom BBoom", "MOMOLAND", R.drawable.img_album_exp5))
            add(Album("Weekend", "태연", R.drawable.img_album_exp6))
        }

        // Recycler View 적용하기
        val lockerPagerAdapter = LockerPagerAdapter(requireActivity(), albumDatas)
        binding.lockerContentVp.adapter = lockerPagerAdapter

        // TabLayout에다가 link ViewPager2
        /*TabLayoutMediator(binding.lockerContentTb, binding.lockerContentVp) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
*/
        return binding.root
    }


}