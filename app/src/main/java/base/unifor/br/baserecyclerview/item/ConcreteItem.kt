package base.unifor.br.baserecyclerview.item

import android.view.View
import base.unifor.br.baserecyclerview.model.MyObject
import kotlinx.android.synthetic.main.item_layout.view.*

class ConcreteItem(itemView: View):BaseItem(itemView) {

    override fun bind(item: Any) {
        val concreteItem = (item as MyObject)
        with(itemView){
            text_view_name.text = concreteItem.name
        }

    }
}