package com.example.recyclerview_ex

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(var profileList : ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, TextView: Int): ProfileAdapter.CustomViewHolder {    // 뷰를 만드는 역할
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener { //뷰를 클릭하였을 때
                var curPos   : Int = adapterPosition
                var profiles : Profiles = profileList.get(curPos) //curPos 번수의 정보를 가져온다
                Toast.makeText(parent.context, "이름 : ${profiles.name} 나이 : ${profiles.age} 직업 : ${profiles.job}", Toast.LENGTH_SHORT).show()
                //정보를 화면에 출력한다
            }

        }
    }
    override fun getItemCount(): Int {   // 리스트의 개수를 반환하는 역할
        return profileList.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {   // onCreateViewHolder 메서드에서 받은 뷰와 데이터를
        holder.gender.setImageResource(profileList.get(position).gender)
        holder.name.text = profileList.get(position).name
        holder.age.text = profileList.get(position).age.toString()
        holder.job.text=  profileList.get(position).job
        // 연동시켜주는 역할
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var gender = itemView.findViewById<ImageView>(R.id.iv_profile) // 성별
        var name = itemView.findViewById<TextView>(R.id.tv_name) // 이름
        var age = itemView.findViewById<TextView>(R.id.tv_age) // 나이
        var job = itemView.findViewById<TextView>(R.id.tv_job) // 직업
    }


}