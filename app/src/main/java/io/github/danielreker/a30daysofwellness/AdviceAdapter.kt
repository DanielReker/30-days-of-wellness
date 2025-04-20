package io.github.danielreker.a30daysofwellness

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.danielreker.a30daysofwellness.model.Advice

class AdviceAdapter(private val items: List<Advice>) :
    RecyclerView.Adapter<AdviceAdapter.AdviceViewHolder>() {

    class AdviceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayText: TextView = itemView.findViewById(R.id.day_number)
        val titleText: TextView = itemView.findViewById(R.id.advice_title)
        val imageView: ImageView = itemView.findViewById(R.id.advice_image)
        val descriptionText: TextView = itemView.findViewById(R.id.advice_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdviceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.advice, parent, false)
        return AdviceViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdviceViewHolder, position: Int) {
        val item = items[position]
        holder.dayText.text = "Day ${position + 1}"
        holder.titleText.text = item.name
        holder.imageView.setImageResource(item.image)
        holder.descriptionText.text = item.description
    }

    override fun getItemCount(): Int = items.size
}