package base.unifor.br.baserecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import base.unifor.br.baserecyclerview.item.BaseItem
import java.util.ArrayList

open abstract class BaseRecyclerViewAdapter(val resId: Int): RecyclerView.Adapter<BaseItem>() {
    var items: ArrayList<Any> = ArrayList()


    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: BaseItem, position: Int) {
       holder.bind(items[position])

    }

    fun addItem(item: Any){
        items.add(item)
        notifyDataSetChanged()
    }

    fun removeItem(item: Any){
        items.remove(item)
        notifyDataSetChanged()
    }

}