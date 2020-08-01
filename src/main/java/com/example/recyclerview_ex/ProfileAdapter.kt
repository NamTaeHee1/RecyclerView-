package com.example.recyclerview_ex

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(var profileList : ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, TextView: Int): ProfileAdapter.CustomViewHolder {    // 뷰를 만드는 역할
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view)
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