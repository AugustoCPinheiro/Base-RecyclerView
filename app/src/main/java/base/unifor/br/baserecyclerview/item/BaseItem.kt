package base.unifor.br.baserecyclerview.item

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open  class BaseItem(itemView: View): RecyclerView.ViewHolder(itemView) {

  open fun bind(item: Any){

  }
}