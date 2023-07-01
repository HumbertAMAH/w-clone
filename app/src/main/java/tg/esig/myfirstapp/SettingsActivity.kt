package tg.esig.myfirstapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import tg.esig.myfirstapp.R

class SettingsActivity : AppCompatActivity() {

    lateinit var usernameTxtv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        usernameTxtv = findViewById(R.id.username_txtv)
        usernameTxtv.text = intent?.getStringExtra("USERNAME")

    }
}