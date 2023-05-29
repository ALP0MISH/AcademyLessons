
package com.example.academylessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylessons.databinding.ActivityMusicListBinding
import com.example.academylessons.models.Music

class Music_List_Activity : AppCompatActivity() {
    private val binding: ActivityMusicListBinding by lazy {
        ActivityMusicListBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val musicList : MutableList<Music> = mutableListOf<Music>()
        musicList.addAll(generateRandomMusicObjects())

        val adapter = MusicAdapter(
            navigateToPlayerListener = {
                navigateToPlayerActivity()
            }
        )
        binding.recyclerView.adapter = adapter
        adapter.updetelist(musicList)


        val firstMusic = Music(
            title = "Car Sick",
            author = "abdurahman",
            posterUrl = "https://townsquare.media/site/81/files/2022/06/attachment-RS20969_GettyImages-958364166-scr.jpg?w=1200&h=0&zc=1&s=0&a=t&q=89"
        )

    }

    private fun navigateToPlayerActivity() {
        val intent = Intent(this, Music_Home_Work::class.java)
        startActivity(intent)

    }

    private fun generateRandomMusicObjects(): List<Music> {
        val musicList: MutableList<Music> = mutableListOf()
        val titles: List<String> = listOf<String>(
            "Amazing Secret",
            "Unspeakable Gem",
            "Today's Street",
            "The Amusement",
            "Remember Flow"
        )

        val authors = listOf(
            "Red Hot Chili Peppers",
            "Silverchair",
            "Disturbed",
            "Black Sabbath"
        )

        val posterUrls = listOf(
            "https://townsquare.media/site/81/files/2022/06/attachment-RS20969_GettyImages-958364166-scr.jpg?w=1200&h=0&zc=1&s=0&a=t&q=89",
            "https://www.thegigcartel.com/images/117Small.jpg",
            "https://avatars.mds.yandex.net/i?id=53b721e6eba9f3d991b3624a4f7b69c628bbe640-9146551-images-thumbs&n=13",
            "https://avatars.mds.yandex.net/i?id=005dd8ac75e13cae6619e9f363758cc41485592a-8497423-images-thumbs&n=13"

        )

        for (i :Int in 0..100){
            musicList.add(
                Music(
                  title = titles.random(),
                  author = authors.random(),
                  posterUrl = posterUrls.random()
                )
            )
        }

            return musicList


    }
}
