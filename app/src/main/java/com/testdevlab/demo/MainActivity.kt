package com.testdevlab.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.testdevlab.demo.handlers.BoxHandler
import com.testdevlab.demo.models.Chocolate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BoxListener {

    private val boxHandler = BoxHandler(this)


    override fun onBoxSizeChanged(size: Int) {
        output.text = resources.getString(R.string.output, size, ",")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_remove.setOnClickListener {
            boxHandler.removeChocolate()
        }

        button_add.setOnClickListener {
            boxHandler.addChocolate(Chocolate(10,"Tasty"))
        }
    }
}
