package com.example.listview

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.listview.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        button=findViewById(R.id.button_login)
        var user=binding.editTextText
        var pass =binding.editTextTextPassword
        var shardPreferences:SharedPreferences=getSharedPreferences("MyData",Context.MODE_PRIVATE)
        var userName=shardPreferences.getString("u","none")
        var password=shardPreferences.getString("p","")
        user.setText(userName)
        pass.setText(password)


        button.setOnClickListener {

                var shardPreferences:SharedPreferences=getSharedPreferences("MyData",Context.MODE_PRIVATE)
                var edetor= shardPreferences.edit()
               edetor.putString("u",user.text.toString())
                edetor.putString("p",pass.text.toString())
                edetor.apply()

                Toast.makeText( this,"DATA SAVED",Toast.LENGTH_SHORT).show()




            }
    }


}