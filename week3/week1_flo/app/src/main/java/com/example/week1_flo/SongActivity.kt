package com.example.week1_flo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.week1_flo.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() { //상속받을 때 소괄호 필요

    lateinit var binding : ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root) //ctrl activity_song.xml의 최상단으로 이동

        binding.songDownIb.setOnClickListener {
            finish() //finish method 실행
        }

        binding.songMiniplayerIv.setOnClickListener {
            setPlayerStatus(false)
        }

        binding.songPauseIv.setOnClickListener {
            setPlayerStatus(true)
        }
    }

    fun setPlayerStatus(isPlaying : Boolean) {
        if(isPlaying){
            binding.songMiniplayerIv.visibility = View.VISIBLE
            binding.songPauseIv.visibility = View.GONE
        } else {
            binding.songMiniplayerIv.visibility = View.GONE
            binding.songPauseIv.visibility = View.VISIBLE
        }
    }
}