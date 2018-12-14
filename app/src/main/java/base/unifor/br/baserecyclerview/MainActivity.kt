package base.unifor.br.baserecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import base.unifor.br.baserecyclerview.adapter.ConcreteAdapter
import base.unifor.br.baserecyclerview.model.MyObject
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    val adapter = ConcreteAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.layoutManager = LinearLayoutManager(this)

        adapter.addItem(MyObject("Augusto"))
        adapter.addItem(MyObject("Jonta"))
        adapter.addItem(MyObject("Ricardo"))
        adapter.addItem(MyObject("Davi"))
        adapter.addItem(MyObject("Plikio"))

        recycler_view.adapter = adapter

    }
}
