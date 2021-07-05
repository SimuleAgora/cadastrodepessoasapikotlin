package com.simuleagora.recyclerview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_name.*
class NameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        btnInsertNome.setOnClickListener {
            if(etNome.text.toString() == ""){
                Toast.makeText(this,"Nome está vazio.",Toast.LENGTH_SHORT).show()
            }
            else {
                val resultIntent = this.intent
                resultIntent.putExtra("nome", etNome.text.toString())
                setResult(Activity.RESULT_OK,resultIntent)
                finish()
            }
        }
        btnCancel.setOnClickListener {
            finish()
        }
    }
}