package base.unifor.br.baserecyclerview.item

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open abstract class BaseItem(itemView: View): RecyclerView.ViewHolder(itemView) {

  open abstract fun bind(item: Any)
}