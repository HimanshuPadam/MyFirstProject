package com.himanshu.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class VerificationActivity : AppCompatActivity() {
    var name =""
    var college =""
    var phoneNo =""
    var marks =""
    var percentage =""
    var tvName: TextView?=null
    var tvCollege: TextView?=null
    var tvMarks: TextView?=null
    var tvPercentage: TextView?=null
    var tvPhoneNo: TextView?=null
    var btnSubmit: Button? = null
    var btnBack: Button?= null
    var cbIAgree: CheckBox? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        intent?.let {
            name = it.getStringExtra("name") ?: ""
            college = it.getStringExtra("college")?: ""
            phoneNo = it.getStringExtra("phoneNo")?: ""
            marks = it.getStringExtra("marks")?:""
            percentage = it.getStringExtra("percentage")?:""
            System.out.println("name= $name college= $college phoneNo= $phoneNo marks=$marks percentage= $percentage")
        }

        tvName=findViewById(R.id.tvName)
        tvCollege=findViewById(R.id.tvCollege)
        tvMarks=findViewById(R.id.tvMarks)
        tvPercentage=findViewById(R.id.tvPercentage)
        tvPhoneNo=findViewById(R.id.tvPhoneNo)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnBack = findViewById(R.id.btnBack)
        cbIAgree = findViewById(R.id.cbIAgree)

        tvName?.setText("Name: $name" )
        tvCollege?.setText("Info about college: $college")
        tvMarks?.setText("Marks: $marks")
        tvPercentage?.setText("Percentage: $percentage")
        tvPhoneNo?.setText("Phone Number: $phoneNo")


        cbIAgree?.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                btnSubmit?.setOnClickListener {
                    var intent = Intent(this, CheckboxRadioActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            } else {
                cbIAgree?.error = "Error! Not Checked"
            }
        }
        btnBack?.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}