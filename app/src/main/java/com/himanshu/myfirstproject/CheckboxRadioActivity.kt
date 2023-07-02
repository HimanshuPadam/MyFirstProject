package com.himanshu.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckboxRadioActivity : AppCompatActivity() {
    var cbIAgree:CheckBox?=null
    var btnSubmitMove: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio)
        cbIAgree=findViewById(R.id.cbIAgree)
        btnSubmitMove=findViewById(R.id.btnSubmit)
        cbIAgree?.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Checked",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Error! Not Checked",Toast.LENGTH_LONG).show()
            }
        }
       btnSubmitMove?.setOnClickListener {
           var intent= Intent(this, )
       }
    }
}