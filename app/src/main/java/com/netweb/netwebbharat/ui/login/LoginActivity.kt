package com.netweb.netwebbharat.ui.login

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.netweb.netwebbharat.R
import com.netweb.netwebbharat.ui.forgetpassword.ForgetPasswordActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var alertDialog: AlertDialog
    private lateinit var forgetEmil_alertDialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var et_username = findViewById(R.id.user_name) as EditText
        var et_password = findViewById(R.id.password) as EditText
        var btn_submit = findViewById(R.id.submit) as Button
        var tv_forget_password = findViewById<TextView>(R.id.forgotPassword)

        btn_submit.setOnClickListener {
            login()
            showCustomDialog_mpin()

        }
        tv_forget_password.setOnClickListener{
            fogetPassword()
        }

    }

    private fun fogetPassword() {
        intent=Intent(this, ForgetPasswordActivity::class.java)
        startActivity(intent)
    }


    fun showCustomDialog_mpin() {
        val inflater: LayoutInflater = this.getLayoutInflater()
        val dialogView: View = inflater.inflate(R.layout.text_input_pop_up, null)


        val bt_input1 = findViewById<EditText>(R.id.inputCode1)
        val bt_input2 = findViewById<EditText>(R.id.inputCode2)
        val bt_input3 = findViewById<EditText>(R.id.inputCode3)
        val bt_input4 = findViewById<EditText>(R.id.inputCode4)
        val bt_verify = findViewById<Button>(R.id.buttonVerify)
        val forgot_Mpin_TextView=findViewById<TextView>(R.id.textResendOTP)

        forgot_Mpin_TextView.setOnClickListener{
            forgotMpin()
        }


        val dialogBuilder: AlertDialog.Builder = AlertDialog.Builder(this)
        dialogBuilder.setOnDismissListener(object : DialogInterface.OnDismissListener {
            override fun onDismiss(arg0: DialogInterface) {

            }
        })
        dialogBuilder.setView(dialogView)

        alertDialog = dialogBuilder.create();
//        alertDialog.window!!.getAttributes().windowAnimations = R.style.PauseDialogAnimation
        alertDialog.show()
    }

    private fun forgotMpin() {

    }

/*
    private fun showCustomDialog_forget_password() {
        val inflater: LayoutInflater = this.getLayoutInflater()
        val forgetEmai_dialogView: View = inflater.inflate(R.layout.forget_password, null)

        val ed_Email = findViewById<EditText>(R.id.editText_Email)
        val bt_submit = findViewById<Button>(R.id.bt_Submit)

        val dialogBuilder: AlertDialog.Builder = AlertDialog.Builder(this)
        dialogBuilder.setOnDismissListener(object : DialogInterface.OnDismissListener {
            override fun onDismiss(arg0: DialogInterface) {

            }
        })
        dialogBuilder.setView(forgetEmai_dialogView)

        forgetEmil_alertDialog = dialogBuilder.create();
//        alertDialog.window!!.getAttributes().windowAnimations = R.style.PauseDialogAnimation
        forgetEmil_alertDialog.show()
    }
*/

    private fun login() {
    }
}




