package com.himanshu.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class CheckboxRadioActivity : AppCompatActivity() {
    var cbIAgree:CheckBox?=null
    var btnSubmitMove: Button?= null
    var name =""
    var college =""
    var phoneNo =""
    var marks =""
    var percentage =""
    var tvName: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio)

        intent?.let {
            name = it.getStringExtra("name") ?: ""
            college = it.getStringExtra("college")?: ""
            phoneNo = it.getStringExtra("phoneNo")?: ""
            marks = it.getStringExtra("marks")?:""
            percentage = it.getStringExtra("percentage")?:""
            System.out.println("name= $name college= $college phoneNo= $phoneNo marks=$marks percentage= $percentage")
        }

        tvName=findViewById(R.id.tvName)
        cbIAgree=findViewById(R.id.cbIAgree)
        btnSubmitMove=findViewById(R.id.btnSubmit)
        tvName?.text = name
        cbIAgree?.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Checked",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Error! Not Checked",Toast.LENGTH_LONG).show()
            }
        }
       btnSubmitMove?.setOnClickListener {
           var intent= Intent(this,EmptyActivity::class.java)
           startActivity(intent)
           finish()
       }
    }
}