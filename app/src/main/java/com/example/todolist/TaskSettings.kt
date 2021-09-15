package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.todolist.databinding.ActivityMainBinding

class TaskSettings : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //val bBack = binding.ivBack as ImageView
        //bBack.setOnClickListener {
        //    val intent = Intent(this, TaskSettings::class.java)
        //    startActivity(intent)
        //}
    }
}