package tg.esig.myfirstapp;

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


public class StudentAdapter(var list: List<Student>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
       var student = list[position]
        holder.update(student)

        holder.row.setOnClickListener{
            val intent = Intent(holder.itemView.context,StudentDetailActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var profile: ImageView = itemView.findViewById(R.id.item_row_icone)
        var fullname: TextView = itemView.findViewById(R.id.item_row_username)
        var email: TextView = itemView.findViewById(R.id.item_row_email)
        var phoneNumber: ImageView = itemView.findViewById(R.id.item_row_phone)
        var row: LinearLayout = itemView.findViewById(R.id.row)

        fun update(student: Student){
            fullname.text = student.fullName
            email.text = student.email
            /*profile.resources = student.*/
        }

    }


}
