package sanjarbek.uz.customdialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<MaterialButton>(R.id.show_dialog).setOnClickListener {
            val dialog = CustomDialog()
            dialog.show(supportFragmentManager, "CustomDialog")
        }
    }
}