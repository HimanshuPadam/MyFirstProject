package com.himanshu.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var etName :EditText?= null
    var etCollegeInfo : EditText?= null
    var etPhoneNo: EditText?= null
    var btnValidate: Button?= null
    var etMarks: EditText?= null
    var etPercentage: EditText?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName=findViewById(R.id.etName)
        etCollegeInfo=findViewById(R.id.etCollege)
        etPhoneNo=findViewById(R.id.etPhoneNo)
        btnValidate=findViewById(R.id.btnValidate)
        etMarks=findViewById(R.id.etMarks)
        etPercentage=findViewById(R.id.etPercentage)

        btnValidate?.setOnClickListener {
            if (etName?.text.isNullOrEmpty()) {
                etName?.error = "Enter your name"
            } else if (etCollegeInfo?.text.isNullOrEmpty()) {
                etCollegeInfo?.error = "Enter something about your college"
            } else if (etPhoneNo?.text.isNullOrEmpty()) {
                etPhoneNo?.error = "Enter your phone number"
            } else if (etPhoneNo?.text.toString().length < 10) {
                etPhoneNo?.error = "Enter at least 10 digits"
            } else {
                Toast.makeText(this, "validation completed successfully", Toast.LENGTH_LONG).show()

                var intent = Intent(this, VerificationActivity::class.java)
                intent.putExtra("name", etName?.text.toString())
                intent.putExtra("college", etCollegeInfo?.text.toString())
                intent.putExtra("phoneNo", etPhoneNo?.text.toString())
                intent.putExtra("marks", etMarks?.text.toString())
                intent.putExtra("percentage", etPercentage?.text.toString())
                startActivity(intent)
                //finish()
            }
        }

    }
}