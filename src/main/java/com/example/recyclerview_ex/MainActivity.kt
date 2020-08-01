package com.example.recyclerview_ex

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var profileList = arrayListOf( // 리스트에 출력할 데이터들
            Profiles(R.drawable.man, name = "홍드로이드", age = 27, job = "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, name = "안드로이드", age = 15, job = "아이폰 앱 개발자"),
            Profiles(R.drawable.man, name = "김드로이드", age = 10, job = "리엑트 앱 개발자"),
            Profiles(R.drawable.woman, name = "신드로이드", age = 40, job = "풀러터 앱 개발자"),
            Profiles(R.drawable.man, name = "이드로이드", age = 20, job = "유니티 앱 개발자"),
            Profiles(R.drawable.woman, name = "윤드로이드", age = 24, job = "알고리즘 앱 개발자"),
            Profiles(R.drawable.woman, name = "민드로이드", age = 69, job = "웹 앱 개발자"),
            Profiles(R.drawable.man, name = "공드로이드", age = 42, job = "하이브리드 앱 개발자"),
            Profiles(R.drawable.woman, name = "찰드로이드", age = 23, job = "그냥 앱 개발자"),
            Profiles(R.drawable.woman, name = "정드로이드", age = 19, job = "배고픈 앱 개발자"),
            Profiles(R.drawable.man, name = "고드로이드", age = 32, job = "졸린 앱 개발자")

        )

        rv_profile.layoutManager = LinearLayoutManager( this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList) //리스트뷰를 만듬
    }
}