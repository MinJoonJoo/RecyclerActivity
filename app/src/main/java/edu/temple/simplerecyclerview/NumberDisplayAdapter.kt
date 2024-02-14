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
        return NumberViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int {
        return arrayInt.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text =arrayInt[position].toString()
        holder.textView.textSize =arrayInt[position].toFloat()
    }
}