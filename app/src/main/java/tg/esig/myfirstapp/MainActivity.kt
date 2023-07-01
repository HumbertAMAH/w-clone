package tg.esig.myfirstapp


import android.annotation.SuppressLint
import android.bluetooth.le.AdvertiseSettings
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    /*lateinit var settingsBtn: Button
    lateinit var usernameEdt: EditText*/

    lateinit var preferences : SharedPreferences
    lateinit var editor : SharedPreferences.Editor

    lateinit var studentList : RecyclerView
    lateinit var students :     ArrayList<Student>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferences = getSharedPreferences("MyPreferences", MODE_PRIVATE)
        studentList = findViewById(R.id.student_list)
        students = ArrayList<Student>()
        students.add(Student("Amah Humbert","amahhumbert606@gmail.com","98527887"))
        students.add(Student("Adjra Kevin","amahhumbert606@gmail.com","98527887"))
        students.add(Student("Aboflan Jeff","amahhumbert606@gmail.com","98527887"))
        students.add(Student("Salou Kadjijatou","amahhumbert606@gmail.com","98527887"))
        students.add(Student("Odoh Simon","amahhumbert606@gmail.com","98527887"))

        var adapter = StudentAdapter(students)
        studentList.layoutManager = LinearLayoutManager(this)
        studentList.adapter = adapter

        if (!preferences.contains("email")) {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

        }

        /*settingsBtn = findViewById(R.id.go_to_setting)
        usernameEdt = findViewById(R.id.username_edt)*/

        /*settingsBtn.setOnClickListener {
            println("***************** Settings Button clicked")

            val username = usernameEdt.text.toString()
            if (username.isEmpty() || username.length < 2){
                usernameEdt.error = "Nom d'utilisateur non valide"
            }else {
                usernameEdt.error = null
                val intent = Intent(this, SettingsActivity::class.java)
                intent.putExtra("USERNAME", username)
                startActivity(intent)

            }
        }*/

    }
}