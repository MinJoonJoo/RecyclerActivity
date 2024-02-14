package edu.temple.simplerecyclerview

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val arrayInt: Array<Int>): RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()
/* Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}