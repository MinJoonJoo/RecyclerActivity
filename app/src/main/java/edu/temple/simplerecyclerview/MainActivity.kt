package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)
        val numbers = Array<Int>(100){i -> (i+1)}
        //Step 4: Provide a RecyclerView.Adapter
        recyclerView.adapter = NumberDisplayAdapter(numbers)
    }
}