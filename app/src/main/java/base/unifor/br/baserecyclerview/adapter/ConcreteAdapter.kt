package base.unifor.br.baserecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import base.unifor.br.baserecyclerview.R
import base.unifor.br.baserecyclerview.item.BaseItem
import base.unifor.br.baserecyclerview.item.ConcreteItem

class ConcreteAdapter: BaseRecyclerViewAdapter(R.layout.item_layout) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseItem {

            val view = LayoutInflater.from(parent.context).inflate(resId, parent, false)
            return ConcreteItem(view)
    }

}