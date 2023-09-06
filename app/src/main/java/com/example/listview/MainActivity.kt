package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var button: Button
    lateinit var imageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        button=findViewById(R.id.btu)
        button.setOnClickListener {
            var intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        LodeImge()

        }


    private fun LodeImge()
    {
        var Url="https://th.bing.com/th/id/OIP.nFtlTeqHyG2yQqh5olfSLgHaEK?w=292&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"
        Glide.with(this).load(Url).placeholder(R.drawable.baseline_public_24).error(R.drawable.baseline_error_24).into(binding.imgid)

    }
    }
